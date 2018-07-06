package com.mine.shortvideo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mine.shortvideo.R;

public class UserGameThumbRecyclerViewAdapter extends RecyclerView.Adapter<UserGameThumbRecyclerViewAdapter.ViewHolder>{
    private Context context;
    private int[] imgs = {R.mipmap.timg_0,R.mipmap.timg_1,R.mipmap.timg_2,R.mipmap.timg_3,R.mipmap.timg_4,R.mipmap.timg_5};
    public UserGameThumbRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_game_thumb,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgThumb.setImageResource(imgs[position]);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgThumb;
        public ViewHolder(View itemView) {
            super(itemView);
            imgThumb = itemView.findViewById(R.id.img_game_thumb);
        }
    }
}
