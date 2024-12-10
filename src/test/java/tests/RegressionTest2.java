import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) '#', (double) (-1.0f), (-1.0d));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass45 = bookingSystem0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) (short) 10, location30, location31);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 10, location38, location39);
        bookingSystem0.updateDriverLocation(0, (double) 'a', (double) (-1));
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide((int) (short) 0, location28, location29);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(100);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (byte) 0, (double) 10);
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) 100L, (double) 10L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        java.util.List<org.example.Ride> rideList57 = bookingSystem0.getRides();
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
        org.junit.Assert.assertNotNull(rideList57);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "", "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(100, location23, location24);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 10, location38, location39);
        bookingSystem0.updateDriverLocation(0, (double) 'a', (double) (-1));
        bookingSystem0.updateDriverLocation(100, (double) 1, (double) 10L);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 100, 0.0d, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(rideList8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.Class<?> wildcardClass43 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        bookingSystem0.bookRide(0, location12, location13);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList6);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList38 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList38);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.User> userList43 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList44 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(rideList44);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        bookingSystem0.bookRide(1, location25, location26);
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((-1), 1.0d, (double) 10.0f);
        java.util.List<java.lang.String> strList44 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 1, 0.0d);
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 100L, (double) (short) 1);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 100, location13, location14);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(rideList35);
        org.junit.Assert.assertNotNull(driverList36);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) 100, location5, location6);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0.0f, 1.0d);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass33 = driverList32.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) 100, 1.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100L, (double) (byte) -1);
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory(100);
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.lang.Class<?> wildcardClass47 = bookingSystem0.getClass();
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.util.List<java.lang.String> strList38 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.User> userList39 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass40 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass7 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) 'a', location21, location22);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        bookingSystem0.updateDriverLocation(1, (double) (-1L), (double) 100);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) '#', location37, location38);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 10, (double) 100L);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((int) (byte) 10, location36, location37);
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide(0, location40, location41);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        bookingSystem0.updateDriverLocation((int) ' ', (double) (byte) 1, (double) 10L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(10, 100.0d, (double) 100);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.util.List<java.lang.String> strList43 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.updateDriverLocation(0, (double) 1.0f, (double) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        org.example.Location location45 = null;
        org.example.Location location46 = null;
        bookingSystem0.bookRide((int) (short) 1, location45, location46);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) '#');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) 10L);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) (-1L), (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        org.example.Location location11 = null;
        org.example.Location location12 = null;
        bookingSystem0.bookRide(10, location11, location12);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 100, (double) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList48 = bookingSystem0.getRideHistory((int) 'a');
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
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(rideList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        bookingSystem0.registerUser("", "", "hi!", "hi!");
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
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.util.List<org.example.Driver> driverList43 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList44 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass45 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList43);
        org.junit.Assert.assertNotNull(driverList44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        bookingSystem0.bookRide((int) (short) 0, location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList6);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
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
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '4', (double) '#', 0.0d);
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "");
        org.example.Location location45 = null;
        org.example.Location location46 = null;
        bookingSystem0.bookRide((int) (byte) 10, location45, location46);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        bookingSystem0.updateDriverLocation((int) (byte) 100, 0.0d, (double) 10.0f);
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass28 = driverList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (byte) -1, location27, location28);
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '#', (double) (short) -1, 10.0d);
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (byte) -1, (double) (byte) 1);
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '#', (double) 0, (double) 10.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((int) (short) 100, location36, location37);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList33);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1), (double) 100.0f);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList3 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        org.example.Location location11 = null;
        org.example.Location location12 = null;
        bookingSystem0.bookRide((int) (byte) 1, location11, location12);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(rideList3);
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 100, 0.0d, (double) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass13 = userList12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location40, location41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        bookingSystem0.updateDriverLocation(1, (double) '#', (-1.0d));
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) '#', location30, location31);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.Class<?> wildcardClass42 = userList41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) 100, (double) 100.0f);
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.util.List<java.lang.String> strList36 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.util.List<java.lang.String> strList39 = bookingSystem0.getRideHistory((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((-1), location17, location18);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100, (double) (short) -1);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) (byte) 10);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList34 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation((int) (short) 10, 0.0d, (double) (-1L));
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        bookingSystem0.bookRide(0, location16, location17);
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) 'a', location20, location21);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10, (double) (short) 100);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) -1, (double) (short) 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        java.util.List<org.example.Driver> driverList42 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(driverList42);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide((int) (short) -1, location27, location28);
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) ' ', location23, location24);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.updateDriverLocation((int) (short) -1, 1.0d, (double) '4');
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) 100, location5, location6);
        java.util.List<org.example.Ride> rideList8 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList8);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) '#', (double) (-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        bookingSystem0.updateDriverLocation((int) ' ', (double) 1, 10.0d);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location41 = null;
        org.example.Location location42 = null;
        bookingSystem0.bookRide((int) '#', location41, location42);
        java.util.List<org.example.Driver> driverList44 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList44);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) '#', location23, location24);
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10, (double) (short) 10);
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) 10, location20, location21);
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "", "");
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) 'a');
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(rideList29);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "hi!");
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        bookingSystem0.updateDriverLocation(100, (double) (-1), (-1.0d));
        org.junit.Assert.assertNotNull(driverList25);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide(0, location35, location36);
        org.example.Location location39 = null;
        org.example.Location location40 = null;
        bookingSystem0.bookRide((int) (short) 10, location39, location40);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(driverList36);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (byte) 10, (double) 0L);
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((int) (byte) -1, location36, location37);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) (short) 0, location17, location18);
        bookingSystem0.updateDriverLocation((int) (short) 10, 100.0d, (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList38 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        java.util.List<org.example.Driver> driverList40 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(rideList39);
        org.junit.Assert.assertNotNull(driverList40);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        bookingSystem0.registerDriver("", "", "", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "hi!");
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 0, location38, location39);
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "");
        java.util.List<java.lang.String> strList50 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 1, location15, location16);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (byte) 1, location19, location20);
        org.junit.Assert.assertNotNull(driverList5);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass15 = rideList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList37 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(rideList36);
        org.junit.Assert.assertNotNull(rideList37);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        bookingSystem0.updateDriverLocation((int) (short) 10, 0.0d, (double) 10);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100, (double) (short) -1);
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (byte) -1, location22, location23);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList29);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        bookingSystem0.bookRide(100, location26, location27);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 100, (double) 0L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.updateDriverLocation(10, 0.0d, 10.0d);
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 100.0f, (double) 0L);
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (byte) 0, location33, location34);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        bookingSystem0.bookRide((-1), location18, location19);
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.util.List<org.example.Driver> driverList38 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList40 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList38);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((int) '#', location32, location33);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList44 = bookingSystem0.getRideHistory(1);
        org.example.Location location46 = null;
        org.example.Location location47 = null;
        bookingSystem0.bookRide((-1), location46, location47);
        java.util.List<org.example.User> userList49 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(userList49);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList21);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) '#', 10.0d, (double) 1L);
        bookingSystem0.updateDriverLocation(0, (double) 100, (double) (-1.0f));
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 1.0f, (double) (-1));
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100L, (-1.0d));
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 1, location13, location14);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "");
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide(0, location36, location37);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass5 = driverList4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) ' ', (double) 0.0f, 0.0d);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(100, location13, location14);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        bookingSystem0.updateDriverLocation((int) '#', (double) (short) 10, (double) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) '#', (double) 10);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 0L, (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        bookingSystem0.registerUser("", "", "", "");
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (byte) 100, location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        bookingSystem0.updateDriverLocation(1, (double) (-1L), (double) 100);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10, (double) (short) 10);
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        bookingSystem0.updateDriverLocation((int) '4', 10.0d, (double) (byte) -1);
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (short) 1, location33, location34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) 1, 100.0d);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) (short) 10, (double) (-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) 100, location5, location6);
        java.lang.Class<?> wildcardClass8 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (-1.0f), (double) '4');
        java.util.List<org.example.Ride> rideList32 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(rideList32);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass10 = driverList9.getClass();
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.util.List<org.example.User> userList54 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList54);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        bookingSystem0.updateDriverLocation(10, (double) (-1L), (double) 100.0f);
        java.util.List<org.example.User> userList43 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) 10, (double) (-1));
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList37);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) ' ', location18, location19);
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (short) 10, location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        bookingSystem0.updateDriverLocation((int) (short) 100, 1.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        bookingSystem0.updateDriverLocation(0, (double) '#', (double) (short) -1);
        java.util.List<org.example.Ride> rideList49 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(rideList49);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide(0, location30, location31);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        bookingSystem0.bookRide((-1), location28, location29);
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
        org.junit.Assert.assertNotNull(rideList31);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 0, location38, location39);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "hi!", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((int) '4', location35, location36);
        bookingSystem0.updateDriverLocation((int) '4', 1.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) (byte) 0, location37, location38);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList25 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList24);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(1, (double) (byte) -1, (double) ' ');
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide((int) 'a', location34, location35);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.example.Location location37 = null;
        org.example.Location location38 = null;
        bookingSystem0.bookRide((int) (byte) 0, location37, location38);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.lang.Class<?> wildcardClass33 = userList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((-1));
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((int) '#', 10.0d, (double) 1L);
        bookingSystem0.updateDriverLocation(0, (double) 100, (double) (-1.0f));
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) 1.0f, (double) (-1));
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.util.List<org.example.Driver> driverList43 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList45 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(driverList43);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((-1), 0.0d, (double) (short) 10);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) (short) 10, location25, location26);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("", "", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) '4', (double) 0L);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 0L, (double) (-1));
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.util.List<org.example.User> userList30 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(rideList35);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((int) (byte) 1);
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass31 = rideList30.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(rideList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) (short) -1, location30, location31);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.example.Location location40 = null;
        org.example.Location location41 = null;
        bookingSystem0.bookRide((int) (short) 0, location40, location41);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(100);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 10L, 10.0d);
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide((int) '4', location17, location18);
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((-1), location21, location22);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 0, (double) (byte) -1);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Driver> driverList35 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(driverList35);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) (-1), 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 'a', (double) '4');
        java.util.List<org.example.User> userList44 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(rideList39);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        java.lang.Class<?> wildcardClass26 = strList25.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList29 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(driverList30);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList6);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.util.List<org.example.Ride> rideList29 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 10.0f, (double) 0.0f);
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(10, (double) ' ', 0.0d);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation(0, (double) (short) 100, (double) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(10, location23, location24);
        org.example.Location location27 = null;
        org.example.Location location28 = null;
        bookingSystem0.bookRide(0, location27, location28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (short) 0, (double) 0L);
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<org.example.Driver> driverList30 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList40 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList30);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) -1, (double) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        bookingSystem0.bookRide((int) (short) -1, location24, location25);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 100.0f, (double) ' ');
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 'a', (double) (short) 100);
        bookingSystem0.updateDriverLocation((int) '4', (-1.0d), (double) (short) 10);
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 1, location24, location25);
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        bookingSystem0.bookRide((int) (short) 10, location26, location27);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 1, location24, location25);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (byte) -1, (double) (-1L));
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((-1), 0.0d, (double) (short) 10);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<java.lang.String> strList4 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (byte) 0, location21, location22);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        java.util.List<org.example.User> userList43 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList44 = bookingSystem0.getDrivers();
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
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(driverList44);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(0, location13, location14);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "");
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (short) 0, (double) 0L);
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide(0, location18, location19);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        bookingSystem0.updateDriverLocation((int) '#', (double) ' ', (double) (short) 10);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "hi!");
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 0, (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(1, location14, location15);
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100L, (-1.0d));
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList21);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 10, location38, location39);
        bookingSystem0.updateDriverLocation(0, (double) 'a', (double) (-1));
        java.util.List<org.example.Ride> rideList45 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(rideList45);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(100);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1), (double) 1.0f);
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "");
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.example.Location location33 = null;
        org.example.Location location34 = null;
        bookingSystem0.bookRide((int) (byte) -1, location33, location34);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(0, location23, location24);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(driverList5);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) '4', (double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0L, 10.0d);
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) (-1L), (double) 1.0f);
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) ' ');
        java.lang.Class<?> wildcardClass24 = strList23.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide(0, location19, location20);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100.0f, (double) ' ');
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        bookingSystem0.updateDriverLocation(1, (double) (-1.0f), (double) (byte) -1);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) (byte) 1, (double) 0);
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 100L, (double) 100.0f);
        bookingSystem0.registerDriver("hi!", "", "", "", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.util.List<org.example.Driver> driverList26 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(driverList26);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide(10, location19, location20);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        java.util.List<org.example.Driver> driverList38 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList39 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList40 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList38);
        org.junit.Assert.assertNotNull(rideList39);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) '4', (double) 1);
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList22);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.User> userList8 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        java.util.List<org.example.Driver> driverList38 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList39 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass40 = rideList39.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList38);
        org.junit.Assert.assertNotNull(rideList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.util.List<org.example.Driver> driverList40 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(driverList40);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.util.List<org.example.Driver> driverList34 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList34);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<java.lang.String> strList41 = bookingSystem0.getRideHistory((int) 'a');
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.util.List<org.example.User> userList41 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10.0f, (double) (-1L));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
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
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 1, (double) (short) 10);
        org.example.Location location28 = null;
        org.example.Location location29 = null;
        bookingSystem0.bookRide(0, location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) 'a', location20, location21);
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass20 = driverList19.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        bookingSystem0.bookRide(0, location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
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
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList38 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList37);
        org.junit.Assert.assertNotNull(rideList38);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        bookingSystem0.updateDriverLocation((int) (byte) 1, 0.0d, (double) (-1L));
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 1, location24, location25);
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        java.util.List<org.example.Driver> driverList38 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList39 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList38);
        org.junit.Assert.assertNotNull(driverList39);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) (short) 10);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((-1), (double) 1.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 1.0f, 10.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        bookingSystem0.updateDriverLocation(0, (double) 10.0f, 0.0d);
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (byte) 10, location19, location20);
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (byte) 0, location23, location24);
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 1, 0.0d);
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0.0f, 1.0d);
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (short) 10, location12, location13);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.util.List<org.example.Ride> rideList31 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(rideList31);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        java.util.List<org.example.Ride> rideList35 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList35);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, (-1.0d), (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass5 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.Class<?> wildcardClass36 = bookingSystem0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, 10.0d, (double) (short) 0);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        org.example.Location location32 = null;
        org.example.Location location33 = null;
        bookingSystem0.bookRide((-1), location32, location33);
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (byte) -1, (double) 'a');
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) 'a', location24, location25);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.example.Location location45 = null;
        org.example.Location location46 = null;
        bookingSystem0.bookRide(0, location45, location46);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        java.util.List<org.example.User> userList50 = bookingSystem0.getUsers();
        org.example.Location location52 = null;
        org.example.Location location53 = null;
        bookingSystem0.bookRide(0, location52, location53);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (byte) -1, location22, location23);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), 0.0d);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) '#', (double) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 1.0f);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (short) 100, location16, location17);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) (byte) 100, location30, location31);
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList36);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList30 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(rideList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) 'a');
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((-1), location35, location36);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        bookingSystem0.updateDriverLocation(1, (double) 0.0f, (double) 100L);
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
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) ' ', location21, location22);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) ' ');
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "", "hi!");
        org.example.Location location36 = null;
        org.example.Location location37 = null;
        bookingSystem0.bookRide((int) (byte) -1, location36, location37);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) 'a', location23, location24);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide(0, location22, location23);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<java.lang.String> strList9 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(rideList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide(0, location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(driverList37);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (short) 1, location24, location25);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (byte) -1, (double) (-1L));
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) '#');
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 1, 10.0d, (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(0, (double) 100, (double) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "hi!");
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (short) 10, location26, location27);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) '#', (double) 10L, (double) 100.0f);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) (short) -1, location30, location31);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList28);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(0);
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList6);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        bookingSystem0.updateDriverLocation((int) ' ', 0.0d, (double) (short) 1);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, 10.0d, (double) (short) 0);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 10L, (double) 10);
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((-1), (double) '#', (double) (short) -1);
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide(10, location23, location24);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) (short) -1);
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.util.List<java.lang.String> strList43 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.Ride> rideList44 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(rideList44);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) 100.0f, 0.0d);
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 1, (double) (short) 10);
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) (-1.0f), (double) 1);
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.Class<?> wildcardClass22 = rideList21.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(rideList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) 'a', location13, location14);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "");
        org.junit.Assert.assertNotNull(driverList16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        bookingSystem0.bookRide((int) '4', location29, location30);
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

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        java.util.List<java.lang.String> strList37 = bookingSystem0.getRideHistory((int) (short) 0);
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(1, location9, location10);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (short) 1, location18, location19);
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) '4', location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((-1));
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (byte) 0, (double) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList3 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(rideList3);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) 10, (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<org.example.Ride> rideList28 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList28);
        org.junit.Assert.assertNotNull(driverList29);
        org.junit.Assert.assertNotNull(rideList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.example.Location location31 = null;
        org.example.Location location32 = null;
        bookingSystem0.bookRide((int) (byte) 10, location31, location32);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 0, 0.0d, (double) 0L);
        bookingSystem0.registerUser("", "hi!", "", "");
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (short) 100, (double) 100.0f);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(10, (double) 100.0f, (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList23);
    }
}

