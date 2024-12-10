import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.lang.Class<?> wildcardClass23 = userList22.getClass();
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) (short) 10, location14, location15);
        bookingSystem0.updateDriverLocation(100, (double) (short) 10, (double) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide(0, location24, location25);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList31);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 10.0f, (double) 0.0f);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.User> userList44 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList7 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(rideList8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide(0, location25, location26);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) 1, 0.0d);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '#', 0.0d, (double) 0);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass7 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        bookingSystem0.updateDriverLocation((int) (short) 10, 100.0d, (double) 1.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (short) 10, 0.0d, (double) (-1L));
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) (short) -1, location28, location29);
        org.junit.Assert.assertNotNull(driverList5);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) 1, 100.0d);
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.Driver> driverList8 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(driverList8);
        org.junit.Assert.assertNotNull(rideList9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (byte) 100, location5, location6);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) '#');
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 'a', (double) (short) 100);
        bookingSystem0.updateDriverLocation((int) (short) 0, 1.0d, (-1.0d));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100L, (double) 10L);
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 0, (double) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        bookingSystem0.updateDriverLocation(10, (double) 0, (double) (short) 10);
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((-1), location32, location33);
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) ' ', (double) 'a', (double) 0.0f);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) 1);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 0, location13, location14);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass17 = rideList16.getClass();
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "");
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) 'a', location8, location9);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (short) 1, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        org.example.Location location11 = null;
        org.example.Location location12 = null;
        bookingSystem0.bookRide((int) (short) 1, location11, location12);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '#', (double) (byte) 1, (double) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide(1, location12, location13);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 100, location13, location14);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) '4', 100.0d);
        java.util.List<org.example.Driver> driverList35 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList35);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass7 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(10, (double) 100L, (double) 1.0f);
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(rideList28);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) '#', location15, location16);
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) (short) 1);
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((-1), location23, location24);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(100);
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide(0, location33, location34);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) '4', 100.0d);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList28);
        org.junit.Assert.assertNotNull(rideList29);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        bookingSystem0.bookRide((int) (short) 0, location33, location34);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) -1, location24, location25);
        bookingSystem0.updateDriverLocation(0, (double) (short) 1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 10, (double) 10);
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerUser("", "", "", "hi!");
        java.lang.Class<?> wildcardClass42 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide(0, location36, location37);
        bookingSystem0.registerUser("hi!", "", "", "hi!");
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
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        bookingSystem0.bookRide((int) (byte) 100, location29, location30);
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        java.util.List<org.example.Ride> rideList7 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(rideList7);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        bookingSystem0.updateDriverLocation(10, 10.0d, (double) 0L);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (-1), (double) (byte) 1);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass19 = driverList18.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide(0, location24, location25);
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 10, (double) 10);
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "hi!");
        java.util.List<org.example.User> userList51 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList29);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass11 = rideList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, 0.0d, (double) 1L);
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) 'a', (double) 'a', (double) (short) -1);
        java.util.List<java.lang.String> strList44 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.User> userList45 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10.0f, 1.0d);
        bookingSystem0.updateDriverLocation(1, (double) (short) 10, (double) (-1.0f));
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, 100.0d, 0.0d);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 10.0f, (double) 0.0f);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) '#', 0.0d, (double) 0.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList39 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList40 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) '#', location38, location39);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 1, location15, location16);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, 10.0d);
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList34);
        org.junit.Assert.assertNotNull(rideList35);
        org.junit.Assert.assertNotNull(driverList36);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '#', 100.0d, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1L, (double) 100);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "");
        java.util.List<org.example.User> userList41 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(100);
        bookingSystem0.registerUser("hi!", "", "", "");
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        bookingSystem0.updateDriverLocation(1, (double) ' ', (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.util.List<org.example.Driver> driverList33 = bookingSystem0.getDrivers();
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
        org.junit.Assert.assertNotNull(driverList33);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (byte) 100, location15, location16);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        java.util.List<org.example.Driver> driverList35 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(driverList35);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        bookingSystem0.bookRide(10, location20, location21);
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide(0, location10, location11);
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide(1, location12, location13);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = rideList13.getClass();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        bookingSystem0.bookRide((int) ' ', location16, location17);
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        bookingSystem0.updateDriverLocation(0, (double) 100L, (double) (byte) -1);
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass30 = userList29.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) '#', location17, location18);
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(100, location23, location24);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) ' ', (double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (short) 100, location23, location24);
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) (short) 10);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (short) 0);
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide(10, location32, location33);
        bookingSystem0.registerUser("", "", "", "hi!");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        bookingSystem0.bookRide((int) (short) 100, location18, location19);
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(0, location23, location24);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) 10, location24, location25);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 10, location24, location25);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.updateDriverLocation((int) (short) -1, 100.0d, (double) 10.0f);
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(rideList31);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((-1), location40, location41);
        java.lang.Class<?> wildcardClass43 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (short) 1, location22, location23);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) '4');
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) 10.0f);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((-1), (double) ' ', (double) 10L);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass19 = driverList18.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) '#', location15, location16);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide(10, location19, location20);
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (byte) 0, location23, location24);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (byte) 100, location26, location27);
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) (short) 100, location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) 1, (double) 10.0f);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "");
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (byte) 100, location33, location34);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (byte) 1, location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 10, location24, location25);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '4', (double) ' ', (double) 10);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass29 = userList28.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 'a', (double) 'a');
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (short) 1, location34, location35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide(1, location20, location21);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass33 = driverList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass16 = userList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 100.0f, (double) (-1.0f));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(0, (double) (short) 0, (double) 1L);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((-1), (double) (short) 1, (double) (-1.0f));
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, 100.0d, 0.0d);
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        org.example.Location location41 = null;
        org.example.Location location42 = null;
        bookingSystem0.bookRide((int) (short) 100, location41, location42);
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        bookingSystem0.bookRide((-1), location31, location32);
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '#', (double) (short) -1, 10.0d);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass24 = rideList23.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '#', (double) (byte) 100, (double) (short) -1);
        bookingSystem0.registerUser("", "", "hi!", "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) (byte) -1, (double) (short) 100);
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (short) 100, location18, location19);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) 1, 1.0d);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass29 = driverList28.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(driverList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, 10.0d, (double) 0.0f);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) ' ', location27, location28);
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(rideList29);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList7 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList6);
        org.junit.Assert.assertNotNull(rideList7);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide(10, location27, location28);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (short) 100, location23, location24);
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(rideList12);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList7 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, 100.0d, 0.0d);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (short) 0, (double) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<java.lang.String> strList4 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(rideList5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.User> userList8 = bookingSystem0.getUsers();
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) ' ', location10, location11);
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass21 = driverList20.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) '4', location25, location26);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1), (double) (short) -1);
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide(1, location8, location9);
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass33 = userList32.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(1, location22, location23);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(100);
        bookingSystem0.updateDriverLocation(1, (double) '#', (double) 100.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((-1), location40, location41);
        java.util.List<org.example.Driver> driverList43 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(10, (double) (byte) 1, (double) 1);
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList43);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        bookingSystem0.updateDriverLocation((int) (short) 100, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) '4', (double) (byte) 0);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 0L, (double) 'a');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((-1), location40, location41);
        java.util.List<org.example.Driver> driverList43 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(10, (double) (byte) 1, (double) 1);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) '#', (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList43);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (short) -1, location17, location18);
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(100, location35, location36);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, 100.0d, (double) 1);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        bookingSystem0.updateDriverLocation(100, (double) (short) 10, (double) 100L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((-1), (double) 0, 0.0d);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 100, location13, location14);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(100, (double) 'a', (double) 1.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        java.lang.Class<?> wildcardClass31 = driverList30.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.util.List<org.example.Driver> driverList47 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList48 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList46);
        org.junit.Assert.assertNotNull(driverList47);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(1, location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.Class<?> wildcardClass33 = driverList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        bookingSystem0.updateDriverLocation((int) 'a', 0.0d, (double) (-1L));
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((-1), location21, location22);
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass26 = driverList25.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.Driver> driverList8 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(driverList8);
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) 0, location24, location25);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.lang.Class<?> wildcardClass47 = driverList46.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList44);
        org.junit.Assert.assertNotNull(driverList45);
        org.junit.Assert.assertNotNull(driverList46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (short) -1, location17, location18);
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) 10, location24, location25);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 100, (double) 10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(1, (double) 100L, (double) 10);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) 'a');
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) '#', location18, location19);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide(0, location17, location18);
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (byte) -1, location33, location34);
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(rideList31);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) '4', (double) (short) 0);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) (short) -1);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) -1, location16, location17);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList41 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(driverList41);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) '4', (double) 100);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 0, 100.0d);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(10, (double) (-1), (double) '#');
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (short) 10, location17, location18);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) ' ', (double) 'a');
        bookingSystem0.registerUser("hi!", "", "", "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100L, (-1.0d));
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 100.0f, (double) 0L);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        bookingSystem0.updateDriverLocation(0, 10.0d, 10.0d);
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) ' ', location6, location7);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (short) 100, (double) 0L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) (short) -1);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(10);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 0, (double) (byte) 10);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(10, (double) (-1L), (double) 0.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (-1L), (-1.0d));
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '4', location14, location15);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10.0f, 1.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (short) 100, location18, location19);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) 1, 1.0d);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 1, location15, location16);
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList37 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location35, location36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        bookingSystem0.bookRide((int) (short) 100, location18, location19);
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (short) 1, location22, location23);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory(10);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (short) 10, 10.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, 10.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) 0, location24, location25);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) 0, (double) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 10, (double) 10);
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (byte) 10, (double) 10);
        java.util.List<org.example.User> userList43 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(1, location22, location23);
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((-1), location26, location27);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        bookingSystem0.bookRide((int) '4', location32, location33);
        bookingSystem0.updateDriverLocation(0, (double) 0L, (double) (short) 100);
        java.util.List<org.example.User> userList39 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory(100);
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(0, (double) '4', (double) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) '#', location28, location29);
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(1, (double) (byte) 0, (double) 0.0f);
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 10, location15, location16);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) '4', 0.0d);
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        bookingSystem0.updateDriverLocation((int) ' ', (double) 100L, (double) 100);
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (byte) 10, location38, location39);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.lang.Class<?> wildcardClass38 = strList37.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 10, 0.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(rideList35);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.Class<?> wildcardClass28 = driverList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((-1), location14, location15);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, 1.0d);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '4', 100.0d, 1.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1), 10.0d);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, 10.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) 100, (double) 10L);
        bookingSystem0.updateDriverLocation((int) (short) 100, 1.0d, (double) 0L);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "hi!");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 100.0f, (double) ' ');
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.util.List<org.example.Ride> rideList42 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList42);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "", "");
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(driverList36);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        bookingSystem0.updateDriverLocation((int) (byte) 1, 0.0d, (double) 10.0f);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        java.util.List<org.example.Driver> driverList45 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList45);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(100);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation(100, (double) 10.0f, (double) 1.0f);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide(10, location33, location34);
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (short) 1);
        bookingSystem0.updateDriverLocation(10, (double) (short) 100, (double) (short) 1);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 10.0f, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 100.0f, (double) 0L);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(0, (double) (short) -1, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) 1, 0.0d);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 0, 100.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide(0, location26, location27);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) 100L, (double) 1.0f);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (short) 10, location21, location22);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location32, location33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (short) 100, (double) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (short) 1, 0.0d);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (short) 1, location33, location34);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList40 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.Ride> rideList41 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(rideList41);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.updateDriverLocation((int) (short) -1, 100.0d, (double) 10.0f);
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (short) 0, location33, location34);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 1, 1.0d);
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (byte) -1, location33, location34);
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) '#', location37, location38);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(rideList31);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.registerUser("", "", "hi!", "");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (byte) 100, location5, location6);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (short) 0, location9, location10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) '4', location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        bookingSystem0.bookRide((int) (byte) 100, location19, location20);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        bookingSystem0.updateDriverLocation((-1), (double) 100.0f, (double) 100L);
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.lang.Class<?> wildcardClass28 = strList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass11 = userList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass28 = driverList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(1, (double) 1L, (double) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '#', 100.0d, (double) (short) 0);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1L, (double) 100);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (byte) 0, 100.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) ' ', location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 100L, (double) 100.0f);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) 1, location24, location25);
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) 'a', location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) '4', location18, location19);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 1, 0.0d, (double) (-1L));
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass22 = driverList21.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        bookingSystem0.bookRide((int) ' ', location16, location17);
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        bookingSystem0.bookRide((int) '4', location32, location33);
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory((int) ' ');
        java.util.List<org.example.User> userList37 = bookingSystem0.getUsers();
        org.example.Location location39 = null;
        org.example.Location location40 = null;
        bookingSystem0.bookRide((int) (byte) 1, location39, location40);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(1, location9, location10);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.util.List<java.lang.String> strList37 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.util.List<org.example.Driver> driverList39 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList40 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(driverList39);
        org.junit.Assert.assertNotNull(driverList40);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 1, 1.0d);
        bookingSystem0.updateDriverLocation((int) (byte) 1, 0.0d, (double) (short) 100);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        bookingSystem0.updateDriverLocation(100, 0.0d, 0.0d);
        bookingSystem0.updateDriverLocation((-1), (double) (byte) 10, (double) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) '4', (double) 1);
        java.util.List<java.lang.String> strList37 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100.0f, 100.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) (short) -1, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass35 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation(100, (double) 10.0f, (double) 1.0f);
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (byte) -1, (double) 10L);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        bookingSystem0.bookRide((int) (byte) -1, location37, location38);
        java.lang.Class<?> wildcardClass40 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide(0, location15, location16);
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) (short) 10, location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 100, (double) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((-1), location36, location37);
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((int) 'a', location40, location41);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass27 = driverList26.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (short) 10, location7, location8);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "hi!");
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList35);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) ' ', location26, location27);
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(rideList29);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        bookingSystem0.bookRide((int) (short) 100, location29, location30);
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass20 = userList19.getClass();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        bookingSystem0.updateDriverLocation(100, (double) (byte) -1, (double) 100.0f);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, 10.0d, (double) 0.0f);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(1, location29, location30);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 10, (double) '#');
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(rideList31);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        bookingSystem0.updateDriverLocation((-1), (double) 0L, (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory(1);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) '#', location25, location26);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) ' ', (double) 'a');
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 100, (double) (byte) 1);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1L), (double) 1.0f);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 10, (double) 0L);
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(10);
        bookingSystem0.updateDriverLocation((int) '#', (double) 1L, (double) (byte) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) 100, (double) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 100.0f, (double) ' ');
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (short) 1, location17, location18);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 100, (double) (byte) -1);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList54 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass55 = driverList54.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList12);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide((int) '#', location10, location11);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(100, location23, location24);
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        bookingSystem0.updateDriverLocation(100, (double) 0L, (double) (-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "");
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) 0, location27, location28);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) ' ', location27, location28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 1, location8, location9);
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) '4', location12, location13);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(0, location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList6);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList7 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList6);
        org.junit.Assert.assertNotNull(rideList7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10, 100.0d);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList9);
    }
}

