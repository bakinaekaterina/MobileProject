package com.example.mymobileproject.repo;

import com.example.mymobileproject.model.Section;

import java.util.ArrayList;
import java.util.List;

public class SectionRepo {

    List<Section> sectionList = new ArrayList<>();
    List<Section> fullSectionList = new ArrayList<>();

    public SectionRepo() {
        sectionList.add(new Section(1, "БЕЗЗЕРКАЛЬНЫЕ\nКАМЕРЫ", 1));
        sectionList.add(new Section(2, "ЗЕРКАЛЬНЫЕ\nКАМЕРЫ", 1));
        sectionList.add(new Section(3, "ВИДЕО\nКАМЕРЫ", 1));
        sectionList.add(new Section(4, "ЭКШН\nКАМЕРЫ", 1));

        sectionList.add(new Section(5, "ФОТО И ВИДЕО\nОБЪЕКТИВЫ", 2));
        sectionList.add(new Section(6, "КИНООБЪЕКТИВЫ", 2));

        sectionList.add(new Section(7, "КАРТЫ ПАМЯТИ\nИ ДИСКИ", 3));
        sectionList.add(new Section(8, "АККУМУЛЯТОРЫ\nИ ЗАРЯДКИ", 3));

        fullSectionList.addAll(sectionList);

    }

    public List<Section> getSectionList() {
        return sectionList;
    }

}
