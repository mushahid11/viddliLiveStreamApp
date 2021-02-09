package com.eclairiose.viddli;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eclairiose.viddli.Adapter.AdapterCurrentUser;
import com.eclairiose.viddli.Adapter.AdapterDiscoverUser;
import com.eclairiose.viddli.Model.ModelCurrentUser;
import com.eclairiose.viddli.Model.ModelDiscoverUser;

import java.util.ArrayList;


public class Streams extends Fragment {
    RecyclerView recyclerView_SPR;
    AdapterDiscoverUser adapterSPR;
    ArrayList<ModelDiscoverUser> streamList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_streams, container, false);

        recyclerView_SPR = (RecyclerView) v.findViewById(R.id.recyclerView_SPR);

        adapterSPR = new AdapterDiscoverUser(streamList, getContext());
        recyclerView_SPR.setAdapter(adapterSPR);
        return v;
    }
}