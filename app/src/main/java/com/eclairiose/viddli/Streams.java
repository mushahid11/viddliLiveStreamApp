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
import com.eclairiose.viddli.Adapter.AdapterStream;
import com.eclairiose.viddli.Model.ModelCurrentUser;
import com.eclairiose.viddli.Model.ModelDiscoverUser;
import com.eclairiose.viddli.Model.ModelStream;

import java.util.ArrayList;


public class Streams extends Fragment {
    RecyclerView recyclerView_S;
    AdapterStream adapterStream;
    ArrayList<ModelStream> streamList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_streams, container, false);

        recyclerView_S = (RecyclerView) v.findViewById(R.id.recyclerView_S);
          ModelStream modelStream = new ModelStream();
        for(int i = 0;i<10;i++) {
            streamList.add(new ModelStream(R.drawable.u1));
            streamList.add(new ModelStream(R.drawable.imran));
            streamList.add(new ModelStream(R.drawable.alice));
            streamList.add(new ModelStream(R.drawable.aliseena));

            streamList.add(modelStream);
        }
        adapterStream = new AdapterStream(streamList, getContext());
        recyclerView_S.setAdapter(adapterStream);
        return v;
    }
}