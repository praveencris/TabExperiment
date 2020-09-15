package com.sabkayar.praveen.tabexperiment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumberOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior, int numOfTabs) {
        super(fm, behavior);
        mNumberOfTabs = numOfTabs;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position position of tab
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
        }
        return new TabFragment1();
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
