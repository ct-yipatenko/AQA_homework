package com.company;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Main {

    //task2 class
    enum Cars{
        Honda, Suzuki, Nissan, Lada
    }


    public static void main(String[] args) {

        //task 1

        List<String> proglanguages = new ArrayList<>();

        proglanguages.add("Java");
        proglanguages.add("PHP");
        proglanguages.add("C#");
        proglanguages.add("NODE.JS");

        System.out.println("The backend programming languages are " + proglanguages);

        System.out.println();

        //tas 2 driver
        Cars bestprice= Cars.Honda;

        System.out.println(bestprice);

        System.out.println();

        //task 3
        Map<String, String> vehicles = new HashMap<>();

        vehicles.put("BMW", "5");

        System.out.println(vehicles.get("BMW"));

        System.out.println();

        //task 4
        int[] intArray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        System.out.println(Arrays.toString(intArray));

        int counter = 0;
        for (int i = 0; i<intArray.length; i++)
                counter++;

        System.out.println(counter);

        System.out.println();


        //task 5
        List<String> fifthtasklist = new ArrayList<>();
        fifthtasklist.add("Hello");
        fifthtasklist.add("World");
        fifthtasklist.add("It");
        fifthtasklist.add("Is");
        fifthtasklist.add("Yaroslav");


        int size = 0;

        for (int length = 0; length <fifthtasklist.size(); length++){
            System.out.println(fifthtasklist.get(length));
                size++;
            }
        System.out.println("The size of current arraylist is " + size);

        System.out.println();

        //task6


        ArrayList<String> sixthtasklist = new ArrayList<String>(){{
            add("Ivan Ivanov");
            add("Petro Petrov");
            add("Sidor Sidorov");
            add("Yaroslav Yaroslavov");
            add("Ivan Ivanenko");
            add("Petro Petrenko");
            add("Maxym Maxymov");
            add("Anton Antonov");
            add("Anton Antonenko");
            add("Vasil Vasiliev");
            add("Yaroslav Yaroslavoy");
        }};

        int largestStringLength = sixthtasklist.get(0).length();


        for (String item : sixthtasklist) {
            if(item.length() > largestStringLength) {
                largestStringLength = item.length();
            }
        }

        for (String item : sixthtasklist) {
            if (item.length() == largestStringLength) {
                System.out.println(item);
            }
        }

        System.out.println();


        //task7


        Map<String, String> fruitsandvegetables = new HashMap<>();

        fruitsandvegetables.put("watermelon", "berry");
        fruitsandvegetables.put("banana", "fruit");
        fruitsandvegetables.put("cherry", "berry");
        fruitsandvegetables.put("pineapple", "fruit");
        fruitsandvegetables.put("melon", "vegetable");
        fruitsandvegetables.put("cranberry", "berry");
        fruitsandvegetables.put("apple", "fruit");
        fruitsandvegetables.put("iris", "flower");
        fruitsandvegetables.put("potato", "vegetable");
        fruitsandvegetables.put("carrot", "vegetable");


        for (Map.Entry<String, String> entry : fruitsandvegetables.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println();

        //task 8
        for (Map.Entry<String, String> entry : fruitsandvegetables.entrySet()) {
            String value = entry.getValue();
            if(value.equals("vegetable"))
                System.out.println(value + "/" + entry.getKey());
        }

        System.out.println();

        //task9


        ArrayList <Integer> ninthtask = new ArrayList<>();
        Set <Integer> randomnumbers = new HashSet<Integer>();

        int max = 100;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < 100; i++) {
            int rand = (int)(Math.random() * range) + min;
            ninthtask.add(rand);
        }

        randomnumbers.addAll(ninthtask);

        System.out.println(randomnumbers);
        System.out.println(ninthtask.size() - randomnumbers.size());
    }
}
