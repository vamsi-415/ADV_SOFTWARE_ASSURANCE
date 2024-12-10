package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        // Create a new Driver instance with test data
        driver = new Driver(1, "John Doe", "john.doe@example.com", "1234567890", "password123",
                "ABC123", "Toyota Corolla", "XYZ-1234");
    }

    @Test
    public void testDriverConstructor() {
        // Verify the constructor initializes the fields correctly
        assertEquals(1, driver.getUserId());
        assertEquals("John Doe", driver.getName());
        assertEquals("john.doe@example.com", driver.getEmail());
        assertEquals("1234567890", driver.getPhone());
        assertEquals("password123", driver.getPassword());
        assertEquals("ABC123", driver.getLicenseNumber());
        assertEquals("Toyota Corolla", driver.getCarModel());
        assertEquals("XYZ-1234", driver.getCarNumber());
        assertTrue(driver.isAvailable()); // Default availability is true
        assertNotNull(driver.getCurrentLocation()); // Default location should not be null
    }

    @Test
    public void testUpdateLocation() {
        // Initial location should be (0.0, 0.0)
        Location initialLocation = driver.getCurrentLocation();
        assertEquals(0.0, initialLocation.getLatitude());
        assertEquals(0.0, initialLocation.getLongitude());

        // Update the driver's location
        driver.updateLocation(40.7128, -74.0060); // New York coordinates
        Location updatedLocation = driver.getCurrentLocation();
        assertEquals(40.7128, updatedLocation.getLatitude());
        assertEquals(-74.0060, updatedLocation.getLongitude());
    }

    @Test
    public void testSetAvailable() {
        // Initially, the driver should be available
        assertTrue(driver.isAvailable());

        // Set the driver as unavailable
        driver.setAvailable(false);
        assertFalse(driver.isAvailable());

        // Set the driver back to available
        driver.setAvailable(true);
        assertTrue(driver.isAvailable());
    }

    @Test
    public void testGetLicenseNumber() {
        // Verify that the license number is returned correctly
        assertEquals("ABC123", driver.getLicenseNumber());
    }

    @Test
    public void testGetCarModel() {
        // Verify that the car model is returned correctly
        assertEquals("Toyota Corolla", driver.getCarModel());
    }

    @Test
    public void testGetCarNumber() {
        // Verify that the car number is returned correctly
        assertEquals("XYZ-1234", driver.getCarNumber());
    }
}
