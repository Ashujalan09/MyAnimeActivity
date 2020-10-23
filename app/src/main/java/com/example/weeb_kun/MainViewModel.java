package com.example.weeb_kun;

import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainViewModel extends ViewModel {

    MainRepository mainRepository = new MainRepository();

    public List<String> getTitles(){
        return mainRepository.getTitles();
    }

}