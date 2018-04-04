package com.example.android.warsaw;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context Context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        Context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return Context.getString(R.string.museums);
        } else if (position == 1) {
            return Context.getString(R.string.parks);
        } else if (position == 2) {
            return Context.getString(R.string.restaurants);
        } else {
            return Context.getString(R.string.hotels);
        }
    }
}
