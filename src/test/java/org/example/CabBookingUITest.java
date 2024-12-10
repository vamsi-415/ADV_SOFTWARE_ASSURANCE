package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CabBookingUITest {

    private CabBookingUI cabBookingUI;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        // Initialize CabBookingUI before each test
        cabBookingUI = new CabBookingUI();

        // Capture the output printed to the console
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testRegisterUser() {
        // Test valid user registration
        cabBookingUI.registerUser("John Doe", "john.doe@example.com", "1234567890", "password123");

        // Check if the output contains the expected success message
        assertTrue(outputStream.toString().contains("User Registered Successfully!"));
    }

    @Test
    void testRegisterUserWithEmptyFields() {
        // Test user registration with empty fields
        cabBookingUI.registerUser("", "", "", "");

        // Check if the output contains the expected error message
        assertTrue(outputStream.toString().contains("Please fill all the fields."));
    }

    @Test
    void testRegisterDriver() {
        // Test valid driver registration
        cabBookingUI.registerDriver("Driver Name", "driver@example.com", "0987654321", "password", "ABC1234", "Toyota", "XYZ987");

        // Check if the output contains the expected success message
        assertTrue(outputStream.toString().contains("Driver Registered Successfully!"));
    }

    @Test
    void testRegisterDriverWithEmptyFields() {
        // Test driver registration with empty fields
        cabBookingUI.registerDriver("", "", "", "", "", "", "");

        // Check if the output contains the expected error message
        assertTrue(outputStream.toString().contains("Please fill all the fields."));
    }

    @Test
    void testBookRide() {
        // Test valid ride booking
        cabBookingUI.bookRide(1, "Location A", "Location B");

        // Check if the output contains the expected success message
        assertTrue(outputStream.toString().contains("Ride Booked Successfully!"));
    }

    @Test
    void testBookRideWithEmptyLocations() {
        // Test ride booking with empty pickup/dropoff locations
        cabBookingUI.bookRide(1, "", "");

        // Check if the output contains the expected error message
        assertTrue(outputStream.toString().contains("Please enter both pickup and dropoff locations."));
    }

    @Test
    void testShowRideHistory() {
        // Test showing ride history (assuming the method returns some data)
        cabBookingUI.showRideHistory(1);

        // Check if the output contains the expected ride history message
        assertFalse(outputStream.toString().contains("Ride History:"));
    }

    @Test
    void testShowRideHistoryWithNoHistory() {
        // Test showing ride history when there is no history
        cabBookingUI.showRideHistory(2);

        // Check if the output contains the expected "No ride history found." message
        assertTrue(outputStream.toString().contains("No ride history found."));
    }
}
