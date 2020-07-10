package com.volkova.ClassGeneric;

import java.util.Arrays;
import java.util.Comparator;

public class ClassGeneric <T extends Comparable<? super T>> {
    private T[] array;

    public ClassGeneric(T[] array) {
        this.array = array;
    }

    public T getMax(){
        return Arrays.stream(array).max(Comparator.naturalOrder()).get();
    }

    public T getMin(){
        return Arrays.stream(array).min(Comparator.naturalOrder()).get();
    }
}