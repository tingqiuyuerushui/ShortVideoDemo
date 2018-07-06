package com.mine.shortvideo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mine.shortvideo.R;

public class UserVideoListAdapter extends RecyclerView.Adapter<UserVideoListAdapter.ViewHolder>{
    private Context context;
    private int[] imgs = {R.mipmap.img_list_example_thumb_1,R.mipmap.img_list_example_thumb_0,R.mipmap.img_list_example_thumb_1};

    public UserVideoListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_list_video,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgUserVideoListItemThumb.setImageResource(imgs[position]);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgUserVideoListItemThumb;
        TextView tvUserVideoListItemDescription;
        public ViewHolder(View itemView) {
            super(itemView);
            imgUserVideoListItemThumb = itemView.findViewById(R.id.img_user_video_list_item_thumb);
            tvUserVideoListItemDescription = itemView.findViewById(R.id.tv_user_video_list_item_description);
        }
    }
}
