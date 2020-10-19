package com.example.weeb_kun;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainRecyclerViewAdaptor extends RecyclerView.Adapter<MainRecyclerViewAdaptor.MainRecyclerViewHolder> {

    List<String> titles;

    public MainRecyclerViewAdaptor(List<String> titles){
        this.titles = titles;
    }

    public class MainRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public MainRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.amrl_title);
        }
    }

    @NonNull
    @Override
    public MainRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.actrivity_main_recycler_layout, parent, false);
        return new MainRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecyclerViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

}
