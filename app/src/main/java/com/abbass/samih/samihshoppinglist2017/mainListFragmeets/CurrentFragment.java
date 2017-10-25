package com.abbass.samih.samihshoppinglist2017.mainListFragmeets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.abbass.samih.samihshoppinglist2017.R;

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

        //4.
        return view;
    }

}
