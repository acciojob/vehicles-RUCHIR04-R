package com.driver;

public class F1 extends Car {
    private int maxSpeed;
    private int currentSpeed;

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, 2); // Assume 4 wheels, 2 doors, 6 gears, and 2 seats for an F1 car
        this.maxSpeed = 350; // Example: F1 car top speed
        this.currentSpeed = 0; // Initial speed
    }

    public void accelerate(int rate) {
        int newSpeed = currentSpeed + rate; // Set the value of new speed by using currentSpeed and rate
        if (newSpeed <= 0) {
            newSpeed = 0;
            changeGear(1);
            stop();
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }
        changeSpeed(newSpeed, getCurrentDirection());
        this.currentSpeed = newSpeed; // Update the current speed
    }
}
