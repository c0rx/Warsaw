package com.example.android.warsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        //constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<ListItm> itms = new ArrayList<>();

        itms.add(new ListItm("Name 1", "Description 1", R.drawable.image));
        itms.add(new ListItm("Name 2", "Description 2", R.drawable.image));
        itms.add(new ListItm("Name 3", "Description 3", R.drawable.image));
        itms.add(new ListItm("Name 4", "Description 4", R.drawable.image));
        itms.add(new ListItm("Name 5", "Description 5", R.drawable.image));
        itms.add(new ListItm("Name 6", "Description 6", R.drawable.image));
        itms.add(new ListItm("Name 7", "Description 7", R.drawable.image));
        itms.add(new ListItm("Name 8", "Description 8", R.drawable.image));
        itms.add(new ListItm("Name 9", "Description 9", R.drawable.image));
        itms.add(new ListItm("Name 10", "Description 10", R.drawable.image));
        itms.add(new ListItm("Name 11", "Description 11", R.drawable.image));
        itms.add(new ListItm("Name 12", "Description 12", R.drawable.image));
        itms.add(new ListItm("Name 13", "Description 13", R.drawable.image));
        itms.add(new ListItm("Name 14", "Description 14", R.drawable.image));
        itms.add(new ListItm("Name 15", "Description 15", R.drawable.image));

        ListItmAdapter adapter = new ListItmAdapter(getActivity(), itms);

        ListView listView = (rootView.findViewById(R.id.list));

        listView.setAdapter(adapter);

        return rootView;
    }

}
