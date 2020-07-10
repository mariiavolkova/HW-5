package com.volkova;

import com.volkova.ClassGeneric.ClassGeneric;
import com.volkova.MyList.MyList;

public class Main{

    public static void main(String[] args) {

        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        listInteger.add(40);
        listInteger.add(50);
        listInteger.add(60);

        MyList<String> listString = new MyList<>();
        listString.add("Hello");
        listString.add("Is");
        listString.add("It");
        listString.add("Me");
        listString.add("You");
        listString.add("Looking for");

        System.out.println("Largest Value of listInteger is: " + listInteger.getMaxValue());
        System.out.println("Smallest Value of listInteger is: " + listInteger.getMinValue());

        System.out.println("Largest Value of listString is: " + listString.getMaxValue());
        System.out.println("Smallest Value of listString is: " + listString.getMinValue());

        Integer [] myArray = {5,15,25,35,45,55,65,75,85,95};
        ClassGeneric<Integer> classGeneric;
        classGeneric = new ClassGeneric(myArray);

        System.out.println("Largest Value in classGeneric is: "+ classGeneric.getMax());
        System.out.println("Minimal Value in classGeneric is: " + classGeneric.getMin());
    }
}