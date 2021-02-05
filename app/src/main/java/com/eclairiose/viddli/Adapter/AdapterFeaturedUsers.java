package com.eclairiose.viddli.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.viddli.Model.ModelFeaturedUsers;
import com.eclairiose.viddli.R;

import java.util.List;

public class AdapterFeaturedUsers extends RecyclerView.Adapter<AdapterFeaturedUsers.ViewHolder> {

    List<ModelFeaturedUsers> featuredUserList;
    private Context context;



    public AdapterFeaturedUsers(List<ModelFeaturedUsers> featuredUserList, Context context) {
        this.featuredUserList = featuredUserList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterFeaturedUsers.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_featuredusers,parent,false);

        AdapterFeaturedUsers.ViewHolder viewHolder = new AdapterFeaturedUsers.ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull AdapterFeaturedUsers.ViewHolder holder, int position) {
        holder.userImage.setImageResource(featuredUserList.get(position).getFeaturedUserImage());
    }


    @Override
    public int getItemCount() {
        return featuredUserList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.featuredUser);


        }
    }
}
