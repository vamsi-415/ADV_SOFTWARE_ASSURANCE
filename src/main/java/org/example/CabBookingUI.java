package org.example;

public class CabBookingUI {

    public BookingSystem bookingSystem;

    // Constructor to initialize the system
    public CabBookingUI() {
        bookingSystem = new BookingSystem();
    }

    // Method for User Registration
    public void registerUser(String name, String email, String phone, String password) {
        if (!name.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !password.isEmpty()) {
            bookingSystem.registerUser(name, email, phone, password);
            System.out.println("User Registered Successfully!");
        } else {
            System.out.println("Please fill all the fields.");
        }
    }

    // Method for Driver Registration
    public void registerDriver(String name, String email, String phone, String password, String license, String carModel, String carNumber) {
        if (!name.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !license.isEmpty() &&
                !carModel.isEmpty() && !carNumber.isEmpty()) {
            bookingSystem.registerDriver(name, email, phone, password, license, carModel, carNumber);
            System.out.println("Driver Registered Successfully!");
        } else {
            System.out.println("Please fill all the fields.");
        }
    }

    // Method for Ride Booking
    public void bookRide(int userId, String pickup, String dropoff) {
        if (!pickup.isEmpty() && !dropoff.isEmpty()) {
            // Simulating location objects (you can replace with actual coordinates or data)
            Location pickupLoc = new Location(0, 0);  // Dummy data
            Location dropoffLoc = new Location(0, 0); // Dummy data
            bookingSystem.bookRide(userId, pickupLoc, dropoffLoc);
            System.out.println("Ride Booked Successfully!");
        } else {
            System.out.println("Please enter both pickup and dropoff locations.");
        }
    }

    // Method for Ride History
    public void showRideHistory(int userId) {
        java.util.List<String> history = bookingSystem.getRideHistory(userId);
        if (history.isEmpty()) {
            System.out.println("No ride history found.");
        } else {
            System.out.println("Ride History:");
            for (String record : history) {
                System.out.println(record);
            }
        }
    }

    public static void main(String[] args) {
        // Test the system (you can replace with actual user input or other test cases)
        CabBookingUI cabBookingUI = new CabBookingUI();

        // Test user registration
        cabBookingUI.registerUser("John Doe", "john.doe@example.com", "1234567890", "password123");

        // Test driver registration
        cabBookingUI.registerDriver("Driver Name", "driver@example.com", "0987654321", "password", "ABC1234", "Toyota", "XYZ987");

        // Test ride booking
        cabBookingUI.bookRide(1, "Location A", "Location B");

        // Test ride history
        cabBookingUI.showRideHistory(1);
    }
}
