package com.example;

import java.util.List;

public class Lion {

    public boolean hasMane;
    private FelineClass felineClass;

    public Lion(String sex, FelineClass felineClass) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.felineClass = felineClass;
    }

    public int getKittens() {
        return felineClass.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineClass.getFood("Хищник");
    }
}
