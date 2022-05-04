package com.example.mymobileproject.repo;

import com.example.mymobileproject.model.Type;

import java.util.ArrayList;
import java.util.List;

public class TypeRepo {

    List<Type> typeList = new ArrayList<>();

    public TypeRepo() {
        typeList.add(new Type(1, "canon_eos_r_body", "CANON EOS R BODY"));
        typeList.add(new Type(1, "fujifilm_gfx_50s_body", "FUJIFILM GFX 50S BODY"));
        typeList.add(new Type(1, "canon_eos_r5_body", "CANON EOS R5 BODY"));
        typeList.add(new Type(1, "canon_eos_r6_body", "CANON EOS R6 BODY"));
    }

    public List<Type> getTypeList() {
        return typeList;
    }

}
