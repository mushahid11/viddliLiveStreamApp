package com.eclairiose.viddli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.eclairiose.viddli.Adapter.ViewPagerAdapterSPR;
import com.google.android.material.tabs.TabLayout;

import static java.lang.String.format;

public class MyProfile extends AppCompatActivity {


    TabLayout tab_StreamsProductReview;
    ViewPager pager_streamsProductReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        tab_StreamsProductReview = findViewById(R.id.tab_StreamsProductReview);
        pager_streamsProductReview = findViewById(R.id.pager_streamsProductReview);


        tab_StreamsProductReview.addTab(tab_StreamsProductReview.newTab().setText("Streams"));
        tab_StreamsProductReview.addTab(tab_StreamsProductReview.newTab().setText("Products"));
        tab_StreamsProductReview.addTab(tab_StreamsProductReview.newTab().setText("Reviews"));
        tab_StreamsProductReview.setTabGravity(TabLayout.GRAVITY_FILL);

        ViewPagerAdapterSPR adapter = new ViewPagerAdapterSPR(getSupportFragmentManager(),this,tab_StreamsProductReview.getTabCount());
        pager_streamsProductReview.setAdapter(adapter);

    }
}