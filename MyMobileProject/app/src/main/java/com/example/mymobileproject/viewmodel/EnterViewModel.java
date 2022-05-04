package com.example.mymobileproject.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mymobileproject.model.Category;
import com.example.mymobileproject.model.Enter;
import com.example.mymobileproject.repo.EnterRepo;

import java.util.List;

public class EnterViewModel extends ViewModel {

    private MutableLiveData<Enter> mEnterList = new MutableLiveData<>();
    private EnterRepo repo;

    public void giveEnter(String email){
        mEnterList.setValue(repo.getEnter(email));
    }

    public MutableLiveData<Enter> getmEnterList() {
        return getmEnterList();
    }

}
