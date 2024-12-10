package org.example;

public class Ride {
    private int rideId;
    private User passenger;
    private Driver driver;
    private Location pickup;
    private Location dropoff;
    private double fare;
    private String status;

    public Ride(int rideId, User passenger, Driver driver, Location pickup, Location dropoff) {
        this.rideId = rideId;
        this.passenger = passenger;
        this.driver = driver;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.status = "BOOKED";  // Default status is booked
        this.fare = calculateFare();
    }

    public int getRideId() {
        return rideId;
    }

    public User getPassenger() {
        return passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getPickup() {
        return pickup;
    }

    public Location getDropoff() {
        return dropoff;
    }

    public double getFare() {
        return fare;
    }

    public String getStatus() {
        return status;
    }

    private double calculateFare() {
        double distance = pickup.distanceTo(dropoff);
        double baseFare = 50.0;  // A base fare for the ride
        double perKmRate = 10.0; // A rate for each kilometer
        return baseFare + (distance * perKmRate);
    }
}
