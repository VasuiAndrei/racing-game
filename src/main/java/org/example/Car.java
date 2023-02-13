package org.example;

public class Car {
    String name;
    double fuellevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    int doorCount;
    boolean damaged;
    String color;

    // has-a relationship (aggregation)
    Engine engine;
}
