package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {

    private Location location1;
    private Location location2;

    @BeforeEach
    public void setUp() {
        // Initialize locations with test coordinates
        location1 = new Location(40.7128, -74.0060); // New York coordinates
        location2 = new Location(34.0522, -118.2437); // Los Angeles coordinates
    }

    @Test
    public void testConstructor() {
        // Test that the constructor correctly initializes the latitude and longitude
        assertEquals(40.7128, location1.getLatitude());
        assertEquals(-74.0060, location1.getLongitude());
        assertEquals(34.0522, location2.getLatitude());
        assertEquals(-118.2437, location2.getLongitude());
    }

    @Test
    public void testGetLatitude() {
        // Test the getter for latitude
        assertEquals(40.7128, location1.getLatitude());
        assertEquals(34.0522, location2.getLatitude());
    }

    @Test
    public void testGetLongitude() {
        // Test the getter for longitude
        assertEquals(-74.0060, location1.getLongitude());
        assertEquals(-118.2437, location2.getLongitude());
    }

    @Test
    public void testDistanceTo() {
        // Test the distanceTo method using a known pair of coordinates (New York to Los Angeles)
        double expectedDistance = 3940.0; // Approximate distance in kilometers
        double actualDistance = location1.distanceTo(location2);

        // Assert that the calculated distance is within a reasonable margin of error
        assertTrue(Math.abs(expectedDistance - actualDistance) < 10,
                "The calculated distance should be within 10 km of the expected value.");
    }

    @Test
    public void testDistanceToSameLocation() {
        // Test the distanceTo method when the locations are the same
        Location sameLocation = new Location(40.7128, -74.0060);
        assertEquals(0.0, location1.distanceTo(sameLocation),
                "The distance between the same location should be 0.");
    }

    @Test
    public void testDistanceToZeroCoordinates() {
        // Test the distanceTo method with zero coordinates (0,0) for one location
        Location zeroLocation = new Location(0.0, 0.0);
        double distance = location1.distanceTo(zeroLocation);
        // Since the exact value is not fixed, we will assert that the distance is a reasonable number
        assertTrue(distance > 0, "The distance from (0.0, 0.0) should be positive.");
    }
}
