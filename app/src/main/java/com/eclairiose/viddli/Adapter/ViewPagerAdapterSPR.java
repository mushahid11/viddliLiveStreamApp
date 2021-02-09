package com.eclairiose.viddli.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.eclairiose.viddli.MyProfile;
import com.eclairiose.viddli.Products;
import com.eclairiose.viddli.Reviews;
import com.eclairiose.viddli.Streams;

public class ViewPagerAdapterSPR extends FragmentPagerAdapter {

    public ViewPagerAdapterSPR(FragmentManager fm, MyProfile myProfile, int tabCount) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Streams streams = new Streams();
                return  streams;
            case 1:
                Products products = new Products();
                return products;

            case 2:
                Reviews reviews = new Reviews();
                return reviews;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3; //three fragments
    }
}