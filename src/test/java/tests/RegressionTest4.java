import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        bookingSystem0.bookRide(100, location24, location25);
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) 0, location25, location26);
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) (byte) 100, location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (short) 100, location13, location14);
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) '4');
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (byte) 1, location19, location20);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(1, 0.0d, (double) 1.0f);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 100.0d, 1.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList28);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 100.0f, (double) 0L);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(driverList5);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 10);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) 0, location16, location17);
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 0, (double) (byte) 10);
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide(0, location24, location25);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        bookingSystem0.updateDriverLocation((int) (byte) 1, 0.0d, (double) 10);
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) (byte) 10, location30, location31);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        bookingSystem0.bookRide(100, location24, location25);
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0.0f, 1.0d);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, 1.0d, (double) 100L);
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) '4', 100.0d);
        bookingSystem0.updateDriverLocation(10, (double) (-1), (double) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass36 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.updateDriverLocation(0, (double) 100L, (double) '#');
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList36);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.util.List<org.example.User> userList44 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(10, (-1.0d), 0.0d);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide(0, location26, location27);
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "");
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList34);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (short) 1, location21, location22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) ' ', location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        bookingSystem0.registerUser("", "hi!", "", "");
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (short) 1, location17, location18);
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) 1, (double) 0.0f);
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
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
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (byte) 0, location33, location34);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation(100, (double) 10.0f, (double) 1.0f);
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide(10, location26, location27);
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) (-1.0f), (double) 1);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) 'a', 0.0d);
        bookingSystem0.updateDriverLocation((int) (short) 10, 10.0d, (double) (short) 1);
        bookingSystem0.updateDriverLocation((int) ' ', (double) 1L, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(10, location13, location14);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList6);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide(0, location30, location31);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) '4', location15, location16);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        bookingSystem0.updateDriverLocation((int) '4', 10.0d, (double) (byte) -1);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((-1), (double) 100L, 10.0d);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        bookingSystem0.updateDriverLocation(0, (double) 1, 10.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) (short) -1, location37, location38);
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 100, (double) (short) -1);
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 100, location15, location16);
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        org.example.Location location41 = null;
        org.example.Location location42 = null;
        bookingSystem0.bookRide(10, location41, location42);
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) -1);
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 0, (double) (byte) 1);
        bookingSystem0.updateDriverLocation((int) '4', (-1.0d), (double) (-1L));
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (short) 0, location18, location19);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) 10, (double) 100L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.lang.Class<?> wildcardClass10 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        java.util.List<org.example.Driver> driverList42 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList42);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        bookingSystem0.updateDriverLocation(100, (double) (-1), (double) (-1));
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(0, location29, location30);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(100, location14, location15);
        bookingSystem0.updateDriverLocation(0, (double) (short) 0, (double) 'a');
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(10, location22, location23);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 0, (double) 0L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((int) (byte) 0, location36, location37);
        java.util.List<org.example.Ride> rideList39 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(rideList39);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "hi!");
        java.util.List<org.example.Driver> driverList31 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(driverList31);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) '4', location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(100, (double) (short) 100, 100.0d);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 10, (double) 100);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(0, location29, location30);
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(10, location23, location24);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList35 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(driverList35);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((-1), (double) (byte) 1, (double) 'a');
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (short) -1, location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10, (double) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList8);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        java.lang.Class<?> wildcardClass37 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.updateDriverLocation((int) 'a', (double) (-1), (double) 0L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 1, 0.0d);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) (byte) 0, (double) 10);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        java.lang.Class<?> wildcardClass32 = driverList31.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) '4', location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 1.0f, (double) 0.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(1, location9, location10);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        bookingSystem0.updateDriverLocation((int) (short) 100, 0.0d, (double) 0.0f);
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) ' ', (double) 1, (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide(1, location32, location33);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 10, (double) (short) 100);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((int) (short) 0, location36, location37);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.util.List<java.lang.String> strList37 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Ride> rideList38 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList25);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(rideList38);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) (short) 10);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        org.junit.Assert.assertNotNull(driverList5);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.util.List<org.example.Driver> driverList39 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList41 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.updateDriverLocation((-1), (double) (short) 100, (double) (-1));
        java.util.List<org.example.User> userList46 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide(1, location30, location31);
        java.util.List<org.example.Driver> driverList33 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList33);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 100, location12, location13);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) -1, (double) '4');
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "hi!", "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.Class<?> wildcardClass23 = driverList22.getClass();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(0, location13, location14);
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        org.example.Location location11 = null;
        org.example.Location location12 = null;
        bookingSystem0.bookRide((int) (byte) 10, location11, location12);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        bookingSystem0.updateDriverLocation((int) 'a', (double) (short) 0, (double) 'a');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        bookingSystem0.registerUser("", "", "", "");
        java.lang.Class<?> wildcardClass42 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 0L, 100.0d);
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass28 = rideList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) 'a', location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (byte) 100, location23, location24);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (byte) 0, location25, location26);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.util.List<org.example.User> userList32 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((int) (byte) 10, location35, location36);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) ' ', location9, location10);
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) -1, 1.0d);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(1, location9, location10);
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (short) 1, location13, location14);
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) -1, (double) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, 10.0d, 0.0d);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.Driver> driverList8 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(driverList8);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100.0f, (double) (byte) 10);
        java.util.List<java.lang.String> strList37 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        bookingSystem0.bookRide((int) (byte) 0, location27, location28);
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass40 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        bookingSystem0.updateDriverLocation((-1), 1.0d, (double) 1);
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) 'a', location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((int) (byte) 10, location35, location36);
        org.example.Location location39 = null;
        org.example.Location location40 = null;
        bookingSystem0.bookRide((int) (byte) -1, location39, location40);
        org.example.Location location43 = null;
        org.example.Location location44 = null;
        bookingSystem0.bookRide((int) (byte) 10, location43, location44);
        bookingSystem0.updateDriverLocation(1, (double) (short) 0, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        bookingSystem0.bookRide((int) (short) 100, location30, location31);
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
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        bookingSystem0.bookRide((int) (short) -1, location24, location25);
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) 0, location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '#', (double) (byte) 100, (double) (short) -1);
        bookingSystem0.updateDriverLocation(10, (double) (short) 10, (double) 0L);
        bookingSystem0.registerUser("hi!", "", "", "");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList7 = bookingSystem0.getRides();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 0, (double) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList6);
        org.junit.Assert.assertNotNull(rideList7);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 100, (double) 10.0f);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = rideList13.getClass();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        bookingSystem0.registerDriver("", "", "", "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (byte) 100, location18, location19);
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide(10, location34, location35);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        java.util.List<java.lang.String> strList38 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList38);
    }
}

