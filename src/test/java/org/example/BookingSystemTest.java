package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BookingSystemTest {

    private BookingSystem bookingSystem;

    @BeforeEach
    public void setUp() {
        bookingSystem = new BookingSystem();
    }

    // Test User Registration
    @Test
    public void testRegisterUser() {
        bookingSystem.registerUser("Alice", "alice@example.com", "1234567890", "password123");
        List<User> users = bookingSystem.getUsers();
        assertEquals(1, users.size());
        assertEquals("Alice", users.get(0).getName());
    }

    // Test Driver Registration
    @Test
    public void testRegisterDriver() {
        bookingSystem.registerDriver("Charlie", "charlie@example.com", "1112223333", "driverpassword",
                "D12345", "Toyota Prius", "ABC123");
        List<Driver> drivers = bookingSystem.getDrivers();
        assertEquals(1, drivers.size());
        assertEquals("Charlie", drivers.get(0).getName());
    }

    // Test Update Driver Location
    @Test
    public void testUpdateDriverLocation() {
        bookingSystem.registerDriver("Charlie", "charlie@example.com", "1112223333", "driverpassword",
                "D12345", "Toyota Prius", "ABC123");
        bookingSystem.updateDriverLocation(1, 12.9716, 77.5946);
        Driver driver = bookingSystem.getDrivers().get(0);
        assertNotNull(driver.getCurrentLocation());
        assertEquals(12.9716, driver.getCurrentLocation().getLatitude());
        assertEquals(77.5946, driver.getCurrentLocation().getLongitude());
    }

    // Test Book Ride (Driver should be available)
    @Test
    public void testBookRide() {
        // Register user and driver
        bookingSystem.registerUser("Alice", "alice@example.com", "1234567890", "password123");
        bookingSystem.registerDriver("Charlie", "charlie@example.com", "1112223333", "driverpassword",
                "D12345", "Toyota Prius", "ABC123");

        // Update driver's location
        bookingSystem.updateDriverLocation(1, 12.9716, 77.5946);

        // Book ride
        Location pickup = new Location(12.9716, 77.5946);
        Location dropoff = new Location(12.9353, 77.6245);
        bookingSystem.bookRide(1, pickup, dropoff);

        // Check ride history
        List<String> rideHistory = bookingSystem.getRideHistory(1);
        assertEquals(1, rideHistory.size());
        assertTrue(rideHistory.get(0).contains("Ride ID"));
    }

    // Test Book Ride (No available driver)
    @Test
    public void testBookRideNoDriverAvailable() {
        bookingSystem.registerUser("Bob", "bob@example.com", "0987654321", "password456");

        Location pickup = new Location(12.9716, 77.5946);
        Location dropoff = new Location(12.9353, 77.6245);
        bookingSystem.bookRide(1, pickup, dropoff);

        // Check ride history for non-existing user
        List<String> rideHistory = bookingSystem.getRideHistory(1);
        assertEquals(0, rideHistory.size()); // No ride booked because there are no drivers
    }

    // Test Get Ride History
    @Test
    public void testGetRideHistory() {
        // Register users and drivers
        bookingSystem.registerUser("Alice", "alice@example.com", "1234567890", "password123");
        bookingSystem.registerDriver("Charlie", "charlie@example.com", "1112223333", "driverpassword",
                "D12345", "Toyota Prius", "ABC123");

        // Register ride
        bookingSystem.updateDriverLocation(1, 12.9716, 77.5946);
        Location pickup = new Location(12.9716, 77.5946);
        Location dropoff = new Location(12.9353, 77.6245);
        bookingSystem.bookRide(1, pickup, dropoff);

        // Retrieve history
        List<String> history = bookingSystem.getRideHistory(1);
        assertNotNull(history);
        assertEquals(1, history.size());
        assertTrue(history.get(0).contains("Ride ID"));
    }

    // Test No History for User with No Rides
    @Test
    public void testNoRideHistory() {
        bookingSystem.registerUser("Bob", "bob@example.com", "0987654321", "password456");
        List<String> history = bookingSystem.getRideHistory(1);
        assertTrue(history.isEmpty()); // No history because no ride was booked
    }
}
