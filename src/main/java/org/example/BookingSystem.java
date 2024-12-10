package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

    private List<User> users = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rides = new ArrayList<>();


    // User Registration
    public void registerUser(String name, String email, String phone, String password) {
        int userId = users.size() + 1;
        users.add(new User(userId, name, email, phone, password));
        System.out.println("User " + name + " registered successfully with User ID: " + userId);
    }

    // Driver Registration
    public void registerDriver(String name, String email, String phone, String password,
                               String licenseNumber, String carModel, String carNumber) {
        int driverId = drivers.size() + 1;
        drivers.add(new Driver(driverId, name, email, phone, password, licenseNumber, carModel, carNumber));
        System.out.println("Driver " + name + " registered successfully with Driver ID: " + driverId);
    }

    // Update Driver Location
    public void updateDriverLocation(int driverId, double latitude, double longitude) {
        for (Driver driver : drivers) {
            if (driver.getUserId() == driverId) {
                driver.updateLocation(latitude, longitude);
                System.out.println("Driver " + driverId + " location updated.");
                return;
            }
        }
        System.out.println("Driver not found.");
    }

    // Find Nearest Driver
    private Driver findNearestDriver(Location userLocation) {
        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;
        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                double distance = userLocation.distanceTo(driver.getCurrentLocation());
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestDriver = driver;
                }
            }
        }
        return nearestDriver;
    }

    // Book a Ride
    public void bookRide(int userId, Location pickup, Location dropoff) {
        User user = users.stream().filter(u -> u.getUserId() == userId).findFirst().orElse(null);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        Driver driver = findNearestDriver(pickup);
        if (driver == null) {
            System.out.println("No available drivers nearby.");
            return;
        }

        int rideId = rides.size() + 1;
        Ride ride = new Ride(rideId, user, driver, pickup, dropoff);
        rides.add(ride);
        driver.setAvailable(false); // Mark the driver as unavailable
        System.out.println("Ride booked successfully! Ride ID: " + rideId);
    }

    // View Ride History
    public List<String> getRideHistory(int userId) {
        List<String> history = new ArrayList<>();
        for (Ride ride : rides) {
            if (ride.getPassenger().getUserId() == userId) {
                String rideDetails = "Ride ID: " + ride.getRideId() + "\n" +
                        "Driver: " + ride.getDriver().getName() + "\n" +
                        "Fare: $" + ride.getFare() + "\n" +
                        "Status: " + ride.getStatus() + "\n" +
                        "----------------------";
                history.add(rideDetails);
            }
        }
        return history;
    }

    // For testing purposes
    public List<User> getUsers() {
        return users;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Ride> getRides() {
        return rides;
    }
}
