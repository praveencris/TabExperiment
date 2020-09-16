package com.sabkayar.praveen.tabexperiment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.sabkayar.praveen.tabexperiment.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Set a toolbar to act as ActionBar for this Activity Window
        setSupportActionBar(mBinding.toolbar);

        // Create an instance of the tab layout from the view.--No need as we are using viewBinding

        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText(R.string.tab_label1));
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText(R.string.tab_label2));
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText(R.string.tab_label3));

        // Set the tabs to fill the entire layout.
        mBinding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Use PagerAdapter to manage page views in fragments.
        // Each page is represented by its own fragment.
        PagerAdapter adapter = new PagerAdapter(this, mBinding.tabLayout.getTabCount());
        mBinding.viewPager.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mBinding.tabLayout, mBinding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText(R.string.tab_label1);
                        break;
                    case 1:
                        tab.setText(R.string.tab_label2);
                        break;
                    case 2:
                        tab.setText(R.string.tab_label3);
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

    }

}