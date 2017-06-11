package com.example.abhujeeth.spotsoon;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abhujeeth on 6/10/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<ModelClass> dataset;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public RecyclerAdapter(Context context, List<ModelClass> dataset) {
        this.dataset=dataset;
        mContext = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView text_one,text_two,text_three;
        public ImageView thumbnail_one,thumbnail_two;
        public MyViewHolder(View view) {
            super(view);
            text_one = (TextView) view.findViewById(R.id.text_one);
            text_two = (TextView) view.findViewById(R.id.text_two);
            text_three = (TextView) view.findViewById(R.id.text_three);
            thumbnail_one = (ImageView) view.findViewById(R.id.image_one);
            thumbnail_two = (ImageView) view.findViewById(R.id.image_two);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);//LI inflates and make real view objects and pass it to view
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {

        ModelClass obj=dataset.get(i);
        holder.text_one.setText(obj.getText_one());
        holder.text_two.setText(obj.getText_two());
        holder.text_three.setText(obj.getText_three());
        holder.thumbnail_one.setImageResource(obj.getImage_one());
        holder.thumbnail_two.setImageResource(obj.getImage_two());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
