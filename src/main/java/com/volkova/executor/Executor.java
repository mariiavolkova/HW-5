package main.java.com.volkova.executor;

import main.java.com.volkova.generic.ClassGeneric;
import main.java.com.volkova.list.MyList;

public class Executor {
    private final MyList<Integer> listInt = new MyList<>();
    private final MyList<String> listStr = new MyList<>();

    public void start() {
        addIntegerList();
        addStringList();
        sortList();
        findValue();
    }

    private void addIntegerList() {
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(50);
        listInt.add(60);

        System.out.println(listInt);
    }

    private void addStringList(){
        listStr.add("Hello");
        listStr.add("Is");
        listStr.add("It");
        listStr.add("Me");
        listStr.add("You");
        listStr.add("Looking for");

        System.out.println(listStr);
    }

    private void sortList() {
        System.out.println("Largest Value of listInteger is: " + listInt.getMaxValue());
        System.out.println("Smallest Value of listInteger is: " + listInt.getMinValue());

        System.out.println("Largest Value of listString is: " + listStr.getMaxValue());
        System.out.println("Smallest Value of listString is: " + listStr.getMinValue());
    }

    private void findValue() {
        Integer[] myArray = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        ClassGeneric<Integer> classGeneric;
        classGeneric = new ClassGeneric(myArray);

        System.out.println("Largest Value in classGeneric is: " + classGeneric.getMax());
        System.out.println("Minimal Value in classGeneric is: " + classGeneric.getMin());
    }
}