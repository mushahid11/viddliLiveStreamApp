package com.eclairiose.viddli.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.viddli.Model.ModelProduct;
import com.eclairiose.viddli.Model.ModelStream;
import com.eclairiose.viddli.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolder> {

    List<ModelProduct> ProductList;
    Context context;

    public AdapterProduct(List<ModelProduct> productList, Context context) {
        ProductList = productList;
        this.context = context;
    }



    @NonNull
    @Override
    public AdapterProduct.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_product,parent,false);
       AdapterProduct.ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }
    

    @Override
    public void onBindViewHolder(@NonNull AdapterProduct.ViewHolder holder, int position) {
        holder.ProductImage.setImageResource(ProductList.get(position).getProductImage());
        holder.ProductName.setText(ProductList.get(position).getProductName());
        holder.ProductPrice.setText(ProductList.get(position).getProductPrice());

    }


    @Override
    public int getItemCount() {
        return ProductList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ProductImage;
        TextView ProductName, ProductPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ProductImage = itemView.findViewById(R.id.ProductImage);
            ProductName = itemView.findViewById(R.id.ProductName);
            ProductPrice = itemView.findViewById(R.id.ProductPrice);


        }
    }
}