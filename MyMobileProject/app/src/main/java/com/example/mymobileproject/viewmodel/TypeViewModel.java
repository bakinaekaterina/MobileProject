package com.example.mymobileproject.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mymobileproject.model.Type;
import com.example.mymobileproject.repo.TypeRepo;

import java.util.List;

public class TypeViewModel extends ViewModel {

    private MutableLiveData<List<Type>> mTypeList = new MutableLiveData<>();

    public LiveData<List<Type>> getTypeList() {
        mTypeList.setValue(new TypeRepo().getTypeList());
        return mTypeList;
    }
}
