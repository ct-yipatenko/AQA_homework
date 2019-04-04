package com.company.Task3;

public class Dog {
    private String name;
    private int age;

    public Dog (String name, int age){
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("A dog can't have negative age");
        }
    }

    public void setName(String newName) {
        name = newName;
    }
}



