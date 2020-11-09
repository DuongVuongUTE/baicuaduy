package com.example.foody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class productadapter extends RecyclerView.Adapter<productadapter.productviewholder> {

    Context context;

    public productadapter(Context context, List<product> productList) {
        this.context = context;
        this.productList = productList;
    }

    List<product> productList;
    @NonNull
    @Override
    public productviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        return new productviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productviewholder holder, int position) {
        holder.foodimg.setImageResource(productList.get(position).getImage());
        holder.textView.setText(productList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static final class productviewholder extends RecyclerView.ViewHolder{
        ImageView foodimg;
        TextView textView;

        public productviewholder(@NonNull View itemView) {
            super(itemView);
            foodimg=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.textdecription);
        }
    }
}
