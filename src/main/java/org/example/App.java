package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Car carReference = new Car();
        carReference.name = "Ferarri";
        carReference.maxSpeed = 300;
        carReference.fuellevel = 60;
        carReference.mileage = 12.5;
        carReference.totalTraveledDistance = 0;
        carReference.damaged = true;
        carReference.doorCount = 1;
        carReference.color = "Red";

        Engine engine1 = new Engine();
        engine1.manufacturer = "Ferrari";
        engine1.capacity = 3000;

        carReference.engine = engine1;

        System.out.println("Engine1 capacity: " + engine1.capacity);
        System.out.println("Car engine capacity: " + carReference.engine.capacity);

        engine1.capacity = 4000;
        System.out.println("Car engine capacity after update: " + carReference.engine.capacity);

        // concatenation
        System.out.println("Propierties of car " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuellevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total travel distance: " + carReference.totalTraveledDistance );
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Door Count: " + carReference.doorCount);
        System.out.println("Color: " + carReference.color);
        System.out.println(carReference);

        Car car2 = new Car();
        car2.name = "Renault";
        car2.maxSpeed = 250;
        car2.fuellevel = 70;
        car2.mileage = 12;
        car2.totalTraveledDistance = 100;
        car2.damaged = false;
        car2.doorCount = 3;
        car2.color = "Black";

        car2.engine = new Engine();
        car2.engine.capacity = 2000;

        System.out.println("---------------------------------");
        System.out.println("Propierties of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuellevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total travel distance: " + car2.totalTraveledDistance );
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door Count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);

        double distanceForCar1 = carReference.accelerate(60, 1);

        double distanceForCar2 = car2.accelerate(100, 1);

//        System.out.println("Initial name for car1: " + carReference.name);
//        carReference.name = "Audi";
//        System.out.println("Changed name for car1: " + carReference.name);
//
//        carReference = new Car();
//        System.out.println("Name of new care: " + carReference.name);
//        carReference.name = "BMW";
//
//        carReference = car2;
//        System.out.println("Name of car referenced from 2 variables. CarReference: " + carReference.name);
//        System.out.println("Name of car referenced from 2 variables. Car2: " + car2.name);
//
//        car2.name = "Dacia";
//        System.out.println("Updated name of car referenced from 2 variables. CarReference: " + carReference.name);
//        System.out.println("Updated name of car referenced from 2 variables. Car2: " + car2.name);
//
//        car2 = null;
//
//        System.out.println(carReference.name);
    }
}
