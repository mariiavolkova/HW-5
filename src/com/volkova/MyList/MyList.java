package com.volkova.MyList;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<? super T>> {

    private final ArrayList<T> list;

    public MyList(){
        this.list = new ArrayList<>();
    }

    public void add(T x){
        list.add(x);
    }

    public T getMaxValue(){
        final T max = (T) Collections.max(list);
        return max;
    }

    public T getMinValue(){
        final T min = (T) Collections.min(list);
        return min;
    }
}