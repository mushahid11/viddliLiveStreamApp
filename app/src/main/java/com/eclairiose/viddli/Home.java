package com.eclairiose.viddli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.eclairiose.viddli.Adapter.AdapterAllOption;
import com.eclairiose.viddli.Adapter.AdapterDiscoverUser;
import com.eclairiose.viddli.Adapter.AdapterFeaturedUsers;
import com.eclairiose.viddli.Adapter.AdapterCurrentUser;
import com.eclairiose.viddli.Model.ModelAllOption;
import com.eclairiose.viddli.Model.ModelDiscoverUser;
import com.eclairiose.viddli.Model.ModelFeaturedUsers;
import com.eclairiose.viddli.Model.ModelCurrentUser;

import java.util.ArrayList;
import java.util.List;

import static android.provider.ContactsContract.*;

public class Home extends AppCompatActivity {

    ImageView imgggg ;
    TextView viddli;

    RecyclerView recyclerView, recyclerViewfeaturedUser, recyclerViewDiscoverUser, recyclerViewAllOption;
    List<ModelCurrentUser> chatitem;
    List<ModelFeaturedUsers> listFeaturedUser;
    List<ModelDiscoverUser> listDiscoverUser;
    List<ModelAllOption> listAllOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgggg = findViewById(R.id.imgg);
        viddli = findViewById(R.id.viddli);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewfeaturedUser = findViewById(R.id.recyclerViewfeaturedUser);
        recyclerViewDiscoverUser = findViewById(R.id.recyclerViewDiscoverUser);
        recyclerViewAllOption = findViewById(R.id.recyclerViewAllOption);

        recyclerView.setAdapter(new AdapterCurrentUser(initData(), this));
        recyclerViewfeaturedUser.setAdapter(new AdapterFeaturedUsers(featureUser(), this));
        recyclerViewDiscoverUser.setAdapter(new AdapterDiscoverUser(discoverUser(), this));
        recyclerViewAllOption.setAdapter(new AdapterAllOption(allOptions(), this));

        viddli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,MyProfile.class));
            }
        });

    }


    private List<ModelCurrentUser> initData() {

        chatitem = new ArrayList<>();
        chatitem.add(new ModelCurrentUser(R.drawable.u1, "Ali"));
        chatitem.add(new ModelCurrentUser(R.drawable.u2, "Haider"));
        chatitem.add(new ModelCurrentUser(R.drawable.u3, "Aamir"));
        chatitem.add(new ModelCurrentUser(R.drawable.u4, "Muneeb"));
        chatitem.add(new ModelCurrentUser(R.drawable.u5, "Hasher"));
        chatitem.add(new ModelCurrentUser(R.drawable.u6, "Muhammad"));
        chatitem.add(new ModelCurrentUser(R.drawable.u7, "Sami"));
        chatitem.add(new ModelCurrentUser(R.drawable.u8, "Shoaib"));
        chatitem.add(new ModelCurrentUser(R.drawable.u9, "Zakir"));
        chatitem.add(new ModelCurrentUser(R.drawable.u10, "Ahmad"));
        return chatitem;
    }

    private List<ModelFeaturedUsers> featureUser() {

        listFeaturedUser = new ArrayList<>();
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u1));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u2));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u3));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u4));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u5));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u6));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u7));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u8));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u9));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u9));
        return listFeaturedUser;
    }

    private List<ModelDiscoverUser> discoverUser() {

        listDiscoverUser = new ArrayList<>();
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u1));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u2));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u3));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u4));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u5));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u6));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u7));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u8));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u9));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u9));
        return listDiscoverUser;
    }

    private List<ModelAllOption> allOptions() {
        listAllOptions = new ArrayList<>();
        listAllOptions.add(new ModelAllOption("Latest"));
        listAllOptions.add(new ModelAllOption("Popular"));
        listAllOptions.add(new ModelAllOption("Accessories"));
        listAllOptions.add(new ModelAllOption("Games"));
        listAllOptions.add(new ModelAllOption("Clothes"));
        listAllOptions.add(new ModelAllOption("Products"));
        listAllOptions.add(new ModelAllOption("Others"));
        listAllOptions.add(new ModelAllOption("Others"));
        listAllOptions.add(new ModelAllOption("Games"));
        listAllOptions.add(new ModelAllOption("Games"));
        listAllOptions.add(new ModelAllOption("Games"));
        return listAllOptions;
    }


}