package com.example.weeb_kun;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    MainRepository mainRepository = new MainRepository();

    public List<String> getTitles(){
        return mainRepository.getTitles();
    }

}
