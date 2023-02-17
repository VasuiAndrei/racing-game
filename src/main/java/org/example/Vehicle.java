package org.example;

public class Vehicle {

    // class variable (static variable)
    static int totalVehicleCount;

    String name;
    double fuellevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    boolean damaged;
    String color;

    public Vehicle() {
        totalVehicleCount++;
    }

    //    public Vehicle(String name, double fuellevel, double mileage, double maxSpeed) {
//        this.name = name;
//        this.fuellevel = fuellevel;
//        this.mileage = mileage;
//        this.maxSpeed = maxSpeed;
//    }

    public double accelerate(double speed, double durationInHours) {
        if (fuellevel <= 0 || damaged) {
            System.out.println("You cannot accelerate.");
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful, max speed reached.");
        } else {
            System.out.println("Valid speed entered.");
        }

        // Ferrari is accelerating with 100 km/h for 1h
        System.out.println(name + "is accelerating with " + speed + "km/h for " + durationInHours + "h");

        // local variables
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;

        // same result as the statement above
//        totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle " + name + ": " + totalTraveledDistance);

        double mileageMultiplier = 1;

        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }

        double usedFuel = distance * mileage * mileageMultiplier / 100;

        fuellevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + fuellevel);

        return distance;
    }
}
