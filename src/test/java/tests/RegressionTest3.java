import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(0, location16, location17);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) ' ', location24, location25);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) 10, location20, location21);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (short) 10, 0.0d, (double) (-1L));
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(0, location22, location23);
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (byte) -1, location26, location27);
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList29);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Driver> driverList33 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory(1);
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "hi!");
        java.util.List<org.example.User> userList44 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) -1, location12, location13);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10.0f, (double) (short) 1);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) '#', location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10, 100.0d);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 1.0f, 100.0d);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) -1, (double) 100L);
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(1, location29, location30);
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) -1, location12, location13);
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (short) 100, location18, location19);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) ' ', location14, location15);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) (byte) 1, location28, location29);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList44 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList45 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList46 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList44);
        org.junit.Assert.assertNotNull(driverList45);
        org.junit.Assert.assertNotNull(driverList46);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (byte) 1);
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide(1, location33, location34);
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(rideList31);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerUser("", "", "", "");
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, (double) (byte) 10);
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((-1), location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(0, location29, location30);
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((-1), location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), 0.0d);
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) (short) 0, location37, location38);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) '#', 10.0d, (double) 1L);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(100, location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) 100, 10.0d);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(10, (-1.0d), (double) 100L);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) '4', (double) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide((int) '#', location34, location35);
        java.util.List<java.lang.String> strList38 = bookingSystem0.getRideHistory(0);
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide(0, location40, location41);
        java.util.List<org.example.Driver> driverList43 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(driverList43);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 1, (-1.0d));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 1.0f, 10.0d);
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 1);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) '#', location27, location28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) -1, (double) (-1L));
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) '4', (double) 100L, (double) 'a');
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(driverList37);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) 1, 0.0d);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) 10, location20, location21);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(1, location22, location23);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(rideList31);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        java.util.List<org.example.User> userList38 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList40 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(10, (double) ' ', 0.0d);
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide(0, location20, location21);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        org.example.Location location11 = null;
        org.example.Location location12 = null;
        bookingSystem0.bookRide((-1), location11, location12);
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 1L, (double) 0);
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) 'a', location28, location29);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) '#', 10.0d, (double) 1L);
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(0);
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 100L, (double) (-1.0f));
        org.example.Location location44 = null;
        org.example.Location location45 = null;
        bookingSystem0.bookRide((int) (short) 10, location44, location45);
        org.example.Location location48 = null;
        org.example.Location location49 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location48, location49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList42 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList43 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(driverList43);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 10, (double) '4');
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), (double) 10.0f);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList45 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList45);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 100.0f, (double) (-1.0f));
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) '#', location18, location19);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 1, location21, location22);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (byte) -1, 0.0d);
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        java.util.List<org.example.User> userList44 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 0, (double) (short) 100);
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (short) -1, (double) 0);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(driverList37);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '#', (double) (short) -1, (double) (-1));
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) -1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, (-1.0d));
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) '4', (double) 100.0f);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (-1), (double) 0);
        java.lang.Class<?> wildcardClass55 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) 100);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (byte) 10, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) (short) -1);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) 'a', location30, location31);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) -1, location24, location25);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList41 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(rideList41);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((-1), (double) 100.0f, (double) '#');
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) 10);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList38 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList39 = bookingSystem0.getUsers();
        org.example.Location location41 = null;
        org.example.Location location42 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location41, location42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList37);
        org.junit.Assert.assertNotNull(rideList38);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1.0f), (double) '4');
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList34 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList37 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(rideList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 10, location31, location32);
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass36 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.lang.Class<?> wildcardClass9 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 10, (double) 100L);
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 10, location13, location14);
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide(0, location25, location26);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 10, location31, location32);
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) -1, 0.0d, (double) (short) 10);
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (short) 0, location20, location21);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 0.0f, (double) 10.0f);
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((int) 'a');
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 100, location38, location39);
        org.example.Location location42 = null;
        org.example.Location location43 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (short) 1, location42, location43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 1, location21, location22);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 10, (double) 100L);
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) 'a', location27, location28);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 0L, (double) 0L);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) -1, location25, location26);
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) (byte) 100);
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) '#', location33, location34);
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) '#', location37, location38);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = strList27.getClass();
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide(0, location18, location19);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(100, (double) (-1L), (double) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 0.0f, (double) (byte) -1);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), (double) 10.0f);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((-1), (double) 100.0f, (double) '#');
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) 10);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (short) 10, (double) 100L);
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (-1.0f), (double) 10L);
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        bookingSystem0.registerDriver("", "", "", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide(10, location34, location35);
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList37);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((-1), (double) 100.0f, (double) '#');
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(1, location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (short) 0, (double) 0L);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) '4', location16, location17);
        bookingSystem0.updateDriverLocation((int) (short) -1, (-1.0d), (double) 1L);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass30 = driverList29.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) 1, 0.0d);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) 10, location20, location21);
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '4', (double) (short) -1, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (byte) -1, (double) (short) -1);
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) ' ');
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(1, location22, location23);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) ' ', location27, location28);
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) 'a', location20, location21);
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(10);
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) '4', location16, location17);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((-1), location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 0.0f, (double) (byte) 1);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10, (double) 100.0f);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) (-1L), (double) 0L);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide(1, location31, location32);
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(driverList34);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100, (double) (short) -1);
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        bookingSystem0.registerUser("", "", "", "");
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) -1, (double) (-1L));
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList38 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass47 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(driverList37);
        org.junit.Assert.assertNotNull(rideList38);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) -1, location27, location28);
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory(1);
        bookingSystem0.registerUser("", "", "hi!", "");
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((-1), location38, location39);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = strList22.getClass();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.Driver> driverList8 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(0);
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(driverList8);
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 1, 0.0d);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList12);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (byte) 1);
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (short) 0, (double) 100L);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(rideList31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) 'a');
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((int) (short) -1, location32, location33);
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide(10, location37, location38);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) (-1L), (double) 0L);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, 100.0d);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), (double) 10.0f);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 10L, 10.0d);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        java.util.List<org.example.Ride> rideList7 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass17 = rideList16.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(rideList7);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList7 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) (short) -1, location29, location30);
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation(10, (double) (byte) 10, (double) 100L);
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory(100);
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "");
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList29);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) 0, location27, location28);
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide(0, location31, location32);
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((-1), location35, location36);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) 100);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 1);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "");
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList42 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(rideList42);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.updateDriverLocation(10, (double) ' ', (-1.0d));
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 100.0f, (double) (short) -1);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<java.lang.String> strList4 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (-1L), 0.0d);
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) '4', location21, location22);
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide(100, location26, location27);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) (short) 0, location29, location30);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (byte) 1, location17, location18);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10, (double) (short) 100);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        java.util.List<java.lang.String> strList48 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide((int) '#', location34, location35);
        java.util.List<java.lang.String> strList38 = bookingSystem0.getRideHistory(0);
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide(0, location40, location41);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 0, location24, location25);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) (byte) 0);
        java.util.List<org.example.Driver> driverList46 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList47 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList46);
        org.junit.Assert.assertNotNull(rideList47);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((-1), (double) 1.0f, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((-1), (double) (short) 1, (double) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 10, (double) 10L);
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 10, 0.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(rideList35);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 'a', (double) 100L);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide(1, location34, location35);
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100, (double) (short) -1);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) (byte) 10);
        bookingSystem0.updateDriverLocation(1, (double) 100, (double) 'a');
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 10, location31, location32);
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (short) 1, (double) 100.0f);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) 1, (double) 1L);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass50 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) '#', location27, location28);
        bookingSystem0.updateDriverLocation((int) '4', 100.0d, (double) 100L);
        bookingSystem0.updateDriverLocation((int) ' ', (double) 0, (double) 0.0f);
        java.util.List<java.lang.String> strList39 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 1, 0.0d);
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((-1));
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = strList28.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(1, 10.0d, (double) 1);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) 'a', (double) (short) 100, (double) 10L);
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 1, location31, location32);
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 10.0f, (double) 10L);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) -1, (double) (-1L));
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 10, 0.0d);
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 10, (double) 0);
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (byte) 1, (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) (short) 10);
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (short) 0, (double) 0);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 100, (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) 100, location5, location6);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass12 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(1, 100.0d, (double) (short) 100);
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 1L, (double) (-1));
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) ' ', location14, location15);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 0, (double) (byte) 10);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) 100, location27, location28);
        bookingSystem0.updateDriverLocation((-1), (-1.0d), (double) (short) 1);
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 'a', (double) 100L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (short) 1, location16, location17);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) '4', (double) '#');
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        bookingSystem0.updateDriverLocation(10, (double) ' ', (double) 1.0f);
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 10, (double) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (-1.0f), (double) 100L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 'a', (double) 100L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide(0, location25, location26);
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Driver> driverList33 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList33);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation(0, (double) (short) 100, (double) (-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(0);
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.updateDriverLocation(10, (double) ' ', (-1.0d));
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList6);
        org.junit.Assert.assertNotNull(driverList7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0.0f, 1.0d);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = rideList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 10, (double) (byte) -1);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) (-1.0f));
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (short) 0, (double) 1);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (byte) 0, location25, location26);
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide(1, location19, location20);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList8);
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) 'a', (double) (short) 100, (double) 10L);
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 1, location31, location32);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0.0f, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) (short) 10, location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((-1), location33, location34);
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) 1, 0.0d);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(10, (double) 10, (double) 100.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) 100, location25, location26);
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 1, (double) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(1, (double) 100.0f, (double) 10.0f);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 1L, (double) (-1));
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 0, 100.0d);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1L), (double) 1.0f);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 10, (double) 0L);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide(10, location27, location28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) 'a', location30, location31);
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide((int) (short) 1, location34, location35);
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide(100, location38, location39);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide(100, location21, location22);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) 1, (double) 1);
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 10, location31, location32);
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(100, location16, location17);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) -1, location16, location17);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (short) 0, location20, location21);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((-1), (double) (-1), (double) 0L);
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerUser("", "hi!", "", "");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) '4', location21, location22);
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(0, (double) (short) 1, (double) '#');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(100, (double) (-1.0f), 10.0d);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((int) (short) -1, location32, location33);
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((-1), location36, location37);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation(0, (double) 'a', (double) (byte) 1);
        java.util.List<java.lang.String> strList42 = bookingSystem0.getRideHistory((int) (short) -1);
        java.lang.Class<?> wildcardClass43 = strList42.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 'a', (double) 'a');
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 100, location19, location20);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((-1));
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide(10, location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) 100, location20, location21);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide(0, location18, location19);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 10, 0.0d);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (short) 10, location31, location32);
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) 'a', (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 1, location21, location22);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) 0, location25, location26);
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) '#', location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 10L, (double) (short) 1);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 1, (double) 0);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) (short) 10, location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (short) 1);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) 100, location25, location26);
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (byte) 100, location5, location6);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (short) 10, location26, location27);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 100.0f, (double) 'a');
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (byte) -1, location15, location16);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) -1, (double) (byte) 100);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 1, location21, location22);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (byte) -1, 0.0d);
        java.util.List<java.lang.String> strList37 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (byte) 1);
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList40 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList42 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(driverList40);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 'a', (double) 1L);
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((int) 'a', location35, location36);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) -1, (double) 100L);
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) (byte) -1, location29, location30);
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 10.0f, (-1.0d));
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) 1, (double) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) -1, location12, location13);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide(0, location26, location27);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 1L, (double) (-1));
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) '4', location23, location24);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(0);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) '#', location27, location28);
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.updateDriverLocation((-1), (double) 1L, (double) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) -1, (double) 100L);
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "", "hi!");
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) '4', location33, location34);
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(10, location16, location17);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (-1.0f), (double) 10);
        bookingSystem0.updateDriverLocation((int) '#', (double) 'a', (double) 0L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = rideList13.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) 100, 10.0d);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 10, location21, location22);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 0.0f, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) 100L);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) '#', location21, location22);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((-1), (double) 100.0f, (double) '#');
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(10, (double) 10.0f, (double) 0L);
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) (byte) 100, (double) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(10, location16, location17);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(10, location29, location30);
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) ' ', location24, location25);
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide(0, location28, location29);
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(rideList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList8);
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) 100);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 1);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) 1, location16, location17);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (short) 100, location16, location17);
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass25 = rideList24.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 10, (double) 10L);
        bookingSystem0.updateDriverLocation((int) '4', 1.0d, (double) ' ');
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (short) 100, location16, location17);
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass26 = driverList25.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '4', (double) 0.0f, (double) 10L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 0, (double) (short) 100);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "hi!");
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location34, location35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, 1.0d);
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 1, location12, location13);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0.0f, 1.0d);
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) '4', location21, location22);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) '4', location33, location34);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        org.example.Location location11 = null;
        org.example.Location location12 = null;
        bookingSystem0.bookRide((int) (short) 1, location11, location12);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.updateDriverLocation(10, (double) ' ', (-1.0d));
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, (-1.0d));
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((int) (short) 100, location32, location33);
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) '#', location37, location38);
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 10, location13, location14);
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide(0, location25, location26);
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 0, (double) (short) 100);
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((-1));
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(rideList29);
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) '#', location27, location28);
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "hi!", "");
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((int) (byte) 1, location40, location41);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 1, location12, location13);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) 100, location5, location6);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 0, 100.0d);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(1, (double) (-1L), (double) (-1.0f));
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 10, (double) 10L);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1.0f), (double) '4');
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList39 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(1, (double) '4', (double) 1.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(rideList33);
        org.junit.Assert.assertNotNull(driverList39);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(10, (-1.0d), 0.0d);
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 1, (double) (short) 100);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) '4', location18, location19);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 100, 1.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (-1.0f), (double) (short) 1);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (short) 10, (double) (-1));
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) 100, location27, location28);
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList35 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass36 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(driverList34);
        org.junit.Assert.assertNotNull(driverList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide(0, location15, location16);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) '#', location28, location29);
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 100.0f, (double) 0);
        java.lang.Class<?> wildcardClass37 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) 10.0f);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) (byte) 0);
        bookingSystem0.updateDriverLocation((int) (byte) 1, 10.0d, 1.0d);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 10L, (double) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) -1, location12, location13);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 0, location21, location22);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) 0, location25, location26);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 'a', 0.0d);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        java.util.List<org.example.User> userList38 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList39 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList40 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(rideList39);
        org.junit.Assert.assertNotNull(rideList40);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1L), (double) 1.0f);
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) '#', location23, location24);
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "");
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 1, (double) 10.0f);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        org.example.Location location39 = null;
        org.example.Location location40 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location39, location40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 1, location12, location13);
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) ' ');
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) 0.0f);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(100);
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((-1), (double) (-1.0f), (double) 10);
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 100.0f, (double) 'a');
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '4', (double) 'a', (double) (byte) 1);
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (short) -1, location22, location23);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '#', (double) '4', (double) (byte) 100);
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) '#', location37, location38);
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) -1, 100.0d);
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 100L, (double) 100.0f);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) 100L, (double) 1.0f);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) 0, location27, location28);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList38 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), (double) 10.0f);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) ' ', location10, location11);
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        java.util.List<java.lang.String> strList39 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList40 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) '#', (double) (short) 1);
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide(0, location15, location16);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) '4', location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) '#', location16, location17);
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (double) (-1L));
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide(100, location18, location19);
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '#', (double) '4', (double) (byte) 100);
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) '#', location37, location38);
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) -1, 100.0d);
        bookingSystem0.updateDriverLocation(1, (double) 10.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, 10.0d);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((-1));
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((-1), location18, location19);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "hi!", "hi!");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 0, location24, location25);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 'a', (double) 100L);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 0);
        java.lang.Class<?> wildcardClass24 = strList23.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) -1);
        java.lang.Class<?> wildcardClass26 = strList25.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (-1L), (double) (byte) 0);
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, (-1.0d));
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (byte) 1);
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(rideList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 100, location15, location16);
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(100);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) (byte) 10, location14, location15);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((-1), location18, location19);
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass23 = rideList22.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 1);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (byte) 0, location27, location28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Driver> driverList33 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(driverList34);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 10, 1.0d);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (byte) 100, (double) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 1, (double) (short) 10);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 1, (double) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (byte) 0, location23, location24);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(1, (double) (short) 1, 0.0d);
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide(0, location28, location29);
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((int) '#', location32, location33);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(100, (double) 100L, (double) '4');
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) -1, location8, location9);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList6);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 1, (double) (short) 10);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide(0, location15, location16);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) '4', location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList7 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 100.0f, (double) 100L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 1L, (double) (short) 10);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList28);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) '#', (double) 0);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        java.util.List<org.example.User> userList48 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) -1, (double) 100L);
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(1, location29, location30);
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide(0, location33, location34);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide(10, location24, location25);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList40 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(rideList40);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(driverList34);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) '4', location24, location25);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 0, (double) (short) 100);
        bookingSystem0.updateDriverLocation(0, (double) 10, (double) (-1.0f));
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        java.util.List<org.example.User> userList38 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList47 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(driverList47);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.updateDriverLocation((-1), (double) 0.0f, (double) 0.0f);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) -1, location27, location28);
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (byte) 10, location31, location32);
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) 100.0f, (double) 1L);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((-1), location35, location36);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((-1), (double) (short) 10, (double) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 1, location8, location9);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (short) 100, 0.0d);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) 1, location27, location28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) 0L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, 1.0d);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) (short) 10, location37, location38);
        java.util.List<org.example.Driver> driverList40 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList40);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) ' ', location9, location10);
        bookingSystem0.registerUser("", "", "", "hi!");
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((-1), location18, location19);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) (byte) 0, (double) 10.0f);
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (byte) -1, location26, location27);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList33);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(rideList35);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) (-1L), (double) 0L);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) '4', location27, location28);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 10, (double) 100L);
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((-1), location26, location27);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (byte) 1);
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList34 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) ' ', 100.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (byte) 1, location25, location26);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 100.0d, (double) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(0, location16, location17);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide(0, location20, location21);
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) 100);
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(0);
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (byte) 1, location23, location24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 10, location21, location22);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 0.0f, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) '4', location19, location20);
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass28 = rideList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((-1));
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) '#', (double) 0);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 100, 100.0d, 1.0d);
        bookingSystem0.updateDriverLocation(1, (double) (short) 1, (double) (byte) -1);
        java.util.List<org.example.Ride> rideList43 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(rideList43);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass26 = userList25.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.updateDriverLocation(0, (double) 1L, (double) 0L);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide(0, location25, location26);
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) (short) 0);
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        bookingSystem0.updateDriverLocation(1, (double) 100L, (double) (byte) -1);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) -1, location12, location13);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((-1));
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList24);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, 10.0d, (double) (short) 0);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) '#', (double) 0);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList35 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(driverList35);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) '4', location16, location17);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide(100, location19, location20);
        bookingSystem0.registerUser("", "", "", "hi!");
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) (byte) -1, location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 0, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1.0f), (double) '4');
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList40 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.User> userList41 = bookingSystem0.getUsers();
        org.example.Location location43 = null;
        org.example.Location location44 = null;
        bookingSystem0.bookRide((int) (short) 100, location43, location44);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(rideList33);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 10L, (double) 100);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(100, (double) 1, (double) (short) 100);
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, (double) (short) -1, (double) (short) 0);
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide(100, location19, location20);
        bookingSystem0.registerUser("", "", "", "hi!");
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) ' ', (double) 'a');
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 10, (double) 10L);
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(rideList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) 'a', location10, location11);
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) (byte) -1, location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (-1L), 100.0d);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) 0, location20, location21);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) '4', location21, location22);
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 1, 0.0d);
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((-1));
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "");
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (byte) 0, (double) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(100, location13, location14);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) '4', (double) (short) 1, (double) (short) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(0, location13, location14);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) '4', (double) 100.0f);
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (short) 0, (double) 1);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0, (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Driver> driverList33 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) '#', location27, location28);
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "hi!", "");
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((int) (short) 100, location40, location41);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 1, location12, location13);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) '4', location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) -1, location24, location25);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide((int) (byte) 0, location34, location35);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList27);
    }
}

