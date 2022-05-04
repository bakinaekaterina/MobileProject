package com.example.mymobileproject.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mymobileproject.model.Section;
import com.example.mymobileproject.repo.SectionRepo;

import java.util.List;

public class SectionViewModel extends ViewModel {

    private MutableLiveData<List<Section>> mSectionList = new MutableLiveData<>();

    public LiveData<List<Section>> getSectionList() {
        mSectionList.setValue(new SectionRepo().getSectionList());
        return mSectionList;
    }
}
