package com.fukaimei.viewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class LaunchImproveActivity extends FragmentActivity {

    private int[] lanuchImageArray = {
            R.drawable.guide_bg1, R.drawable.guide_bg2, R.drawable.guide_bg3, R.drawable.guide_bg4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        ViewPager vp_launch = (ViewPager) findViewById(R.id.vp_launch);
        LaunchImproveAdapter mAdapter = new LaunchImproveAdapter(getSupportFragmentManager(), lanuchImageArray);
        vp_launch.setAdapter(mAdapter);
        vp_launch.setCurrentItem(0);
    }

}
