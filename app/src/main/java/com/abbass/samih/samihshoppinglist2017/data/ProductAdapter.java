package com.abbass.samih.samihshoppinglist2017.data;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.abbass.samih.samihshoppinglist2017.R;

/**
 * Created by user on 12/14/2017.
 */

public class ProductAdapter extends ArrayAdapter<Product>
{
    /**
     *
     * @param context
     * @param resource the item xml file ex. R.layout.product_item
     */
    public ProductAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    /**
     * todo מספר סידורי של הנתון(עצם) ממקור הניתונים
     * @param position אthe index of one  data item (object) from the data source. starting from zero
     * @param convertView
     * todo הממשק שיכול להציג אוסף ניתונים לדוגמא ListView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View view= LayoutInflater.from(getContext()).
                inflate(R.layout.product_item,parent,false);

        return view;
    }
}
