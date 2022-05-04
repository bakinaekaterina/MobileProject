package com.example.mymobileproject.repo;

import android.os.Build;

import com.example.mymobileproject.model.Category;
import com.example.mymobileproject.model.Enter;

import java.util.ArrayList;
import java.util.List;

public class EnterRepo {

    public List<Enter> enterList = new ArrayList<>();


    public EnterRepo() {
        enterList.add(new Enter("Бакина Екатерина Сергеевна", "+77777777777", "email@mail.ru"));
    }

    public Enter getEnter(String email) {
        Enter result = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            result = enterList.stream().filter(enter -> enter.getEmail().equals(email)
            ).findFirst().get();
        }
        return result;
    }
}
