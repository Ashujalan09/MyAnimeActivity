package com.example.weeb_kun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> titles;

    MainActivityViewModel mainActivityViewModel;
    RecyclerView recyclerView;
    MainRecyclerViewAdaptor mainRecyclerViewAdaptor;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainActivityViewModel = new MainActivityViewModel(this.getApplication());
        titles = mainActivityViewModel.getTitles();

        recyclerView = findViewById(R.id.activity_main_recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        mainRecyclerViewAdaptor = new MainRecyclerViewAdaptor(titles);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mainRecyclerViewAdaptor);



    }
}