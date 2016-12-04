package com.kvana.cleanrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by kris9 on 12/3/16.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context context;
    List<MydData> my_data;

    public CustomAdapter(Context context, List<MydData> my_data) {

        this.context = context;
        this.my_data = my_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//use inflater to reference the card view layout

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false );


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.desciption.setText(my_data.get(position).getDescription());
Glide.with(context).load(my_data.get(position).getImage_link()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView desciption;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            desciption = (TextView) itemView.findViewById(R.id.description);
            imageView =  (ImageView) itemView.findViewById(R.id.image1);

        }
    }
}
