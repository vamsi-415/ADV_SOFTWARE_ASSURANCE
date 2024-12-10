package org.example;

public class Driver extends User {
    private String licenseNumber;
    private String carModel;
    private String carNumber;
    private boolean available;
    private Location currentLocation;

    public Driver(int userId, String name, String email, String phone, String password,
                  String licenseNumber, String carModel, String carNumber) {
        super(userId, name, email, phone, password);
        this.licenseNumber = licenseNumber;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.available = true;
        this.currentLocation = new Location(0.0, 0.0);  // Default location
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(double latitude, double longitude) {
        this.currentLocation = new Location(latitude, longitude);
    }
}
