package com.abbass.samih.samihshoppinglist2017.mainListFragmeets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.abbass.samih.samihshoppinglist2017.R;
import com.abbass.samih.samihshoppinglist2017.data.Product;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentFragment extends Fragment
{
    //1
    private TextView tvTotal,tvTotalValue,tvCount,tvCountValue;
    private ImageButton imbSave;
    private ListView lstvCurrent;

    public CurrentFragment() {
        // Required empty public constructor
    }
    //2
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //3.
        View view= inflater.inflate(R.layout.fragment_current, container, false);
        //5.
        tvTotal= (TextView) view.findViewById(R.id.tvTotal);
        tvTotalValue= (TextView) view.findViewById(R.id.tvTotalValue);
        tvCount= (TextView) view.findViewById(R.id.tvCount);
        tvCountValue= (TextView) view.findViewById(R.id.tvCountValue);
        imbSave= (ImageButton) view.findViewById(R.id.imbSave);
        lstvCurrent= (ListView) view.findViewById(R.id.lstvCurrent);

        String[] ar={"noor","remaa","teya","shada"};
//        ArrayAdapter<String> arrayAdapter=
//                new ArrayAdapter<String>(this,)
        readAndListen();
        //4.
        return view;
    }

    //read and listen data from firebase
    private  void readAndListen()
    {
        //5. to get user email... user info
        FirebaseAuth auth=FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        String email=user.getEmail();
        email=email.replace('.','*');
        //6. building data reference = data path = data address
        DatabaseReference reference;
        //todo לקבלת קישור למסד הניתונים שלנו
        //todo קישור הינו לשורש של המסד הניתונים
        reference= FirebaseDatabase.getInstance().getReference();
        //7. listening   to data change
        reference.child(email).child("mylist").
                addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot)
                    {
                        for (DataSnapshot ds:dataSnapshot.getChildren())
                        {
                            Product p=ds.getValue(Product.class);
                            Log.d("SL",p.toString());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError)
                    {

                    }
                });
    }

}
