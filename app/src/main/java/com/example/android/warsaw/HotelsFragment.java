package com.example.android.warsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        //constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<ListItm> itms = new ArrayList<>();

        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));
        itms.add(new ListItm(getString(R.string.sample_name), getString(R.string.sample_desc), R.drawable.image));

        ListItmAdapter adapter = new ListItmAdapter(getActivity(), itms);

        ListView listView = (rootView.findViewById(R.id.list));

        listView.setAdapter(adapter);

        return rootView;
    }
}