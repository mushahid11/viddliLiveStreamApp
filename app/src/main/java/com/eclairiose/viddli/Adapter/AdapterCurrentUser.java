package com.eclairiose.viddli.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.viddli.Model.ModelCurrentUser;
import com.eclairiose.viddli.R;

import java.util.List;


public class AdapterCurrentUser extends RecyclerView.Adapter<AdapterCurrentUser.ViewHolder> {

    List<ModelCurrentUser> chatItem;
     Context context;



    public AdapterCurrentUser(List<ModelCurrentUser> chatItem, Context context) {
        this.chatItem = chatItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_currentuser,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userImage.setImageResource(chatItem.get(position).getUserImage());
        holder.userName.setText(chatItem.get(position).getUserName());
    }


    @Override
    public int getItemCount() {
        return chatItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView userName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.currentUserOnline);
            userName = itemView.findViewById(R.id.tvNamee);

        }
    }
}
