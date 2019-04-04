package com.company.Task2;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }



    public boolean fight(Boxer anotherBoxer) {
        return this.age < anotherBoxer.age &&
                this.weight > anotherBoxer.weight &&
                this.strength > anotherBoxer.strength;
    }



    public static void main(String[] args) {
        Boxer yaroslav = new Boxer(20,23,24);
        Boxer john = new Boxer(21,21,21);

        System.out.println(yaroslav.fight(john));
    }
}
