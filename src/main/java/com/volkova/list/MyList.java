package main.java.com.volkova.list;

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
        final T max = Collections.max(list);
        return max;
    }

    public T getMinValue(){
        final T min = Collections.min(list);
        return min;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                '}';
    }
}