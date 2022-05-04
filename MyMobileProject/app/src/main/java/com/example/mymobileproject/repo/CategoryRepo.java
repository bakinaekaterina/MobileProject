package com.example.mymobileproject.repo;

import com.example.mymobileproject.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepo {

    List<Category> categoryList = new ArrayList<>();

    public CategoryRepo() {
        categoryList.add(new Category(1, "cameras", "КАМЕРЫ"));
        categoryList.add(new Category(2, "optic", "ОПТИКА"));
        categoryList.add(new Category(3, "accessories", "АКСЕССУАРЫ"));
        categoryList.add(new Category(4, "light", "СВЕТ"));
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

}
