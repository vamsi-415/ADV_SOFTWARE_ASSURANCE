package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RideTest {

    private User passenger;
    private Driver driver;
    private Location pickup;
    private Location dropoff;
    private Ride ride;

    @BeforeEach
    public void setUp() {
        // Create instances of User, Driver, and Location for the test

        passenger = new User(1, "John Doe", "john.doe@example.com", "1234567890", "password");
        driver = new Driver(1, "Jane Smith", "jane.smith@example.com", "0987654321", "password",
                "ABC123", "Toyota Prius", "XYZ789");

        pickup = new Location(40.7128, -74.0060);  // New York coordinates
        dropoff = new Location(34.0522, -118.2437); // Los Angeles coordinates

        // Create the Ride instance
        ride = new Ride(1, passenger, driver, pickup, dropoff);
    }

    @Test
    public void testConstructor() {
        // Verifying that the Ride object is created correctly
        assertEquals(1, ride.getRideId());
        assertEquals(passenger, ride.getPassenger());
        assertEquals(driver, ride.getDriver());
        assertEquals(pickup, ride.getPickup());
        assertEquals(dropoff, ride.getDropoff());
        assertEquals("BOOKED", ride.getStatus());
    }

    @Test
    public void testFareCalculation() {
        // Calculate the expected fare
        double expectedDistance = pickup.distanceTo(dropoff);
        double expectedFare = 50.0 + (expectedDistance * 10.0); // base fare + per km rate

        assertEquals(expectedFare, ride.getFare(), 0.01, "Fare should be calculated correctly.");
    }

    @Test
    public void testGetFare() {
        // Verifying that the fare is calculated correctly
        double fare = ride.getFare();
        assertTrue(fare > 0, "Fare should be greater than 0.");
    }

    @Test
    public void testStatusInitiallyBooked() {
        // Verifying that the initial status of a ride is "BOOKED"
        assertEquals("BOOKED", ride.getStatus());
    }

    @Test
    public void testPickupLocation() {
        // Verifying the pickup location
        assertEquals(pickup, ride.getPickup());
    }

    @Test
    public void testDropoffLocation() {
        // Verifying the dropoff location
        assertEquals(dropoff, ride.getDropoff());
    }

    @Test
    public void testDriverAndPassenger() {
        // Verifying the driver and passenger details
        assertEquals(driver, ride.getDriver());
        assertEquals(passenger, ride.getPassenger());
    }
}
