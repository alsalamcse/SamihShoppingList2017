package com.abbass.samih.samihshoppinglist2017.mainListFragmeets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abbass.samih.samihshoppinglist2017.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentFragment extends Fragment {


    public CurrentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current, container, false);
    }

}