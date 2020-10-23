package com.example.weeb_kun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.main_drawer_layout);

        NavigationView navigationView = findViewById(R.id.main_nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.openDrawer, R.string.closeDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frag_holder,
                    new MainFragment()).commit();
            navigationView.setCheckedItem(R.id.main_nav_drawer_1);
        }

    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.main_nav_drawer_1:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_frag_holder,
                        new MainFragment()).commit();
                break;
            case R.id.main_nav_drawer_2:
                Toast.makeText(this, "title 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_nav_drawer_3:
                Toast.makeText(this, "title 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_nav_drawer_4:
                Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
//
//        mainActivityViewModel = new MainActivityViewModel(this.getApplication());
//        titles = mainActivityViewModel.getTitles();
//
//        recyclerView = findViewById(R.id.activity_main_recycler_view);
//        linearLayoutManager = new LinearLayoutManager(this);
//        mainRecyclerViewAdaptor = new MainRecyclerViewAdaptor(titles);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(mainRecyclerViewAdaptor);


}