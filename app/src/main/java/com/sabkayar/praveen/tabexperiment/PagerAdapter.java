package com.sabkayar.praveen.tabexperiment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class PagerAdapter extends FragmentStateAdapter {
    int mNumberOfTabs;

    public PagerAdapter(@NonNull FragmentManager fragmentManager, Lifecycle lifecycle, int noOfTabs) {
        super(fragmentManager,lifecycle);
        mNumberOfTabs = noOfTabs;
    }


    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position position of tab
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
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
    public int getItemCount() {
        return mNumberOfTabs;
    }
}
