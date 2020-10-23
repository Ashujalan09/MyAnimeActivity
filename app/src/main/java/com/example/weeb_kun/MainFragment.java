package com.example.weeb_kun;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    List<String> titles;

    //MainActivityViewModel mainActivityViewModel;
    RecyclerView recyclerView;
    MainRecyclerViewAdaptor mainRecyclerViewAdaptor;
    LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.main_fragment, container, false);
        recyclerView = v.findViewById(R.id.activity_main_recycler_view);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        titles = mViewModel.getTitles();

        linearLayoutManager = new LinearLayoutManager(getContext());
        mainRecyclerViewAdaptor = new MainRecyclerViewAdaptor(titles);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mainRecyclerViewAdaptor);


    }

}