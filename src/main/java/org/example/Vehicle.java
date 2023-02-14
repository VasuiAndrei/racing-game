package org.example;

public class Vehicle {

    String name;
    double fuellevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    boolean damaged;
    String color;

    public double accelerate(double speed, double durationInHours) {
        // Ferrari is accelerating with 100 km/h for 1h
        System.out.println(name + "is accelerating with " + speed + "km/h for " + durationInHours + "h");

        // local variables
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;

        // same result as the statement above
//        totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle " + name + ": " + totalTraveledDistance);

        double usedFuel = distance * mileage / 100;

        fuellevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + fuellevel);

        return distance;
    }
}
