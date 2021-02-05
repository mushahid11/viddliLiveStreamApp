package com.eclairiose.viddli.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.viddli.Model.ModelAllOption;
import com.eclairiose.viddli.Model.ModelCurrentUser;
import com.eclairiose.viddli.R;

import java.util.List;

public class AdapterAllOption extends RecyclerView.Adapter<AdapterAllOption.ViewHolder> {

    List<ModelAllOption> chatItem;
    Context context;



    public AdapterAllOption(List<ModelAllOption> chatItem, Context context) {
        this.chatItem = chatItem;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterAllOption.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_alloptions,parent,false);

        AdapterAllOption.ViewHolder viewHolder = new AdapterAllOption.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAllOption.ViewHolder holder, int position) {
        holder.options.setText(chatItem.get(position).getOptions());
    }


    @Override
    public int getItemCount() {
        return chatItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView options;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            options = itemView.findViewById(R.id.options);

        }
    }
}

