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

public class productuudai extends RecyclerView.Adapter<productuudai.productviewuudaiholder> {

    Context context;
    List<product> productList;
    public productuudai(Context context, List<product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public productviewuudaiholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.uudai_item, parent, false);
        return new productviewuudaiholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productviewuudaiholder holder, int position) {
        holder.foodimg.setImageResource(productList.get(position).getImage());
        holder.text.setText(productList.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    public static final class productviewuudaiholder extends RecyclerView.ViewHolder {
        ImageView foodimg;
        TextView text;

        public productviewuudaiholder(@NonNull View itemView) {
            super(itemView);
            foodimg = itemView.findViewById(R.id.image);
            text =itemView.findViewById(R.id.text);
        }

    }
}
