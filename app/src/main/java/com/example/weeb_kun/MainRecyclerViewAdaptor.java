package com.example.weeb_kun;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainRecyclerViewAdaptor extends RecyclerView.Adapter<MainRecyclerViewAdaptor.MainRecyclerViewHolder> {

    public class MainRecyclerViewHolder extends RecyclerView.ViewHolder {
        public MainRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public MainRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
