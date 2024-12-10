package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        // Create an instance of User for the test
        user = new User(1, "John Doe", "john.doe@example.com", "1234567890", "password123");
    }

    @Test
    public void testConstructor() {
        // Verifying that the User object is constructed correctly
        assertEquals(1, user.getUserId());
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("1234567890", user.getPhone());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testGetUserId() {
        // Verifying that the userId is returned correctly
        assertEquals(1, user.getUserId());
    }

    @Test
    public void testGetName() {
        // Verifying that the name is returned correctly
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testGetEmail() {
        // Verifying that the email is returned correctly
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void testGetPhone() {
        // Verifying that the phone is returned correctly
        assertEquals("1234567890", user.getPhone());
    }

    @Test
    public void testGetPassword() {
        // Verifying that the password is returned correctly
        assertEquals("password123", user.getPassword());
    }
}
