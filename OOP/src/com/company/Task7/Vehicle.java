package com.company.Task7;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
        }

        public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at" + currentDirection + "degrees.");
        }
        public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at"  + currentVelocity + "in direction" + currentDirection);
}
        public void stop(){
            this.currentVelocity = 0;
        }

        public String getName() {
        return name;
        }

        public String getSize() {
        return size;
        }

        public int getCurrentVelocity() {
        return currentVelocity;
        }

        public int getCurrentDirection() {
        return currentDirection;
        }
}

class CarVechicle extends Vehicle {
        public CarVechicle(String name, String size) {
                super(name, size);
        }

        int gears;
        public void move (double currentVelocity){
        }

//    public void changeGears(int gear){
//        if((gear<0) && gear>gears){
//            System.out.println("Car only has"+ gears+"gears");
//        }else{
//            System.out.println("car changed to gear "+gear);
//        }
}

class MainVehicle {

    public static void main(String[] args) {
        CarVechicle skoda = new CarVechicle("Skoda", "3");
        skoda.move(334, 34);
        skoda.steer(134);
    }
}