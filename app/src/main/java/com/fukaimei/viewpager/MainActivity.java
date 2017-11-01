package com.fukaimei.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_view_pager).setOnClickListener(this);
        findViewById(R.id.btn_title_strip).setOnClickListener(this);
        findViewById(R.id.btn_tab_strip).setOnClickListener(this);
        findViewById(R.id.btn_launch_simple).setOnClickListener(this);
        findViewById(R.id.btn_launch_improve).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_view_pager) {
            Intent intent = new Intent(this, ViewPagerActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_title_strip) {
            Intent intent = new Intent(this, PagerTitleStripActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_tab_strip) {
            Intent intent = new Intent(this, PagerTabStripActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_launch_simple) {
            Intent intent = new Intent(this, LaunchSimpleActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_launch_improve) {
            Intent intent = new Intent(this, LaunchImproveActivity.class);
            startActivity(intent);
        }
    }

}