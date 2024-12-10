import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass14 = driverList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide(10, location7, location8);
        java.lang.Class<?> wildcardClass10 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass6 = driverList5.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass8 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.lang.Class<?> wildcardClass12 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
        bookingSystem0.bookRide((int) (short) 10, location14, location15);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
        java.lang.Class<?> wildcardClass15 = userList14.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.lang.Class<?> wildcardClass10 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = rideList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass16 = rideList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass23 = driverList22.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass6 = rideList5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 100, 1.0d, (double) 10.0f);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass6 = driverList5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass5 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass16 = userList15.getClass();
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide((int) (byte) 100, location4, location5);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        java.lang.Class<?> wildcardClass19 = driverList18.getClass();
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((-1), location16, location17);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location16, location17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        java.lang.Class<?> wildcardClass15 = userList14.getClass();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        java.util.List<java.lang.String> strList9 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass12 = driverList11.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide(1, location29, location30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(100);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (short) 1, location21, location22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "");
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        java.util.List<org.example.Ride> rideList21 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(rideList21);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(0, (double) 10, 100.0d);
        org.junit.Assert.assertNotNull(driverList6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<org.example.Driver> driverList8 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(driverList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass12 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 0L, (double) ' ');
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory(0);
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList26 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) ' ', location9, location10);
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 1, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory(100);
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        java.lang.Class<?> wildcardClass25 = userList24.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.lang.Class<?> wildcardClass5 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass35 = rideList34.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide((int) ' ', location25, location26);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.lang.Class<?> wildcardClass17 = userList16.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (byte) 1, location23, location24);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass8 = driverList7.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass10 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        java.lang.Class<?> wildcardClass27 = rideList26.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass7 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(1, location9, location10);
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList17);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        bookingSystem0.updateDriverLocation(0, (double) (-1.0f), (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass14 = driverList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) 0L, (double) 0.0f);
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation(1, (double) (byte) 0, (double) 0.0f);
        bookingSystem0.updateDriverLocation((int) (short) 100, (double) (byte) -1, (double) 10.0f);
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(driverList18);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass19 = driverList18.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass16 = rideList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) (byte) 100, location13, location14);
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(driverList21);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) ' ', location9, location10);
        java.lang.Class<?> wildcardClass12 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (short) 100);
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) 'a');
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        java.lang.Class<?> wildcardClass8 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        org.example.Location location34 = null;
        org.example.Location location35 = null;
        bookingSystem0.bookRide((-1), location34, location35);
        org.example.Location location38 = null;
        org.example.Location location39 = null;
        bookingSystem0.bookRide((int) (short) 100, location38, location39);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory(10);
        java.lang.Class<?> wildcardClass23 = strList22.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(rideList12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) 100, location5, location6);
        java.util.List<org.example.User> userList8 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide(1, location15, location16);
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(1);
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 10.0f, (double) (byte) 1);
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, 1.0d);
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(100, (double) (short) 100, 100.0d);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((-1));
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.lang.Class<?> wildcardClass23 = userList22.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "hi!", "", "");
        bookingSystem0.updateDriverLocation((int) '#', (double) 1.0f, (double) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.Class<?> wildcardClass26 = strList25.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList10 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(1);
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.example.Location location30 = null;
        org.example.Location location31 = null;
        bookingSystem0.bookRide((int) (short) 0, location30, location31);
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
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.util.List<org.example.Driver> driverList37 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList37);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        bookingSystem0.registerDriver("", "", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        org.example.Location location10 = null;
        org.example.Location location11 = null;
        bookingSystem0.bookRide(0, location10, location11);
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (byte) -1, 0.0d);
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
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) '4', (double) 0);
        java.util.List<java.lang.String> strList25 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) (byte) 1, 0.0d);
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) (short) 0, (double) (-1.0f));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 1, 0.0d);
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((int) (short) 0);
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        java.util.List<org.example.Ride> rideList40 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(rideList40);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass21 = driverList20.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
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
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) '#', (double) 10);
        bookingSystem0.updateDriverLocation(10, (double) (byte) 0, (double) 0.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        bookingSystem0.registerDriver("", "", "", "", "", "", "");
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) 'a', location18, location19);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(0, location16, location17);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        bookingSystem0.bookRide((int) ' ', location38, location39);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "", "");
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide(10, location18, location19);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) '4', (double) 0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        bookingSystem0.bookRide((int) (short) 0, location15, location16);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(rideList13);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (byte) 1, location21, location22);
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) '4', location16, location17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass20 = userList19.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '4', location14, location15);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(1);
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(driverList27);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.updateDriverLocation((int) '4', (double) (byte) 10, 1.0d);
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        bookingSystem0.bookRide((int) (short) 10, location24, location25);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        bookingSystem0.updateDriverLocation(100, (double) 10, (double) (byte) 1);
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        org.example.Location location35 = null;
        org.example.Location location36 = null;
        bookingSystem0.bookRide((int) 'a', location35, location36);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList32);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Class<?> wildcardClass23 = strList22.getClass();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        bookingSystem0.bookRide((-1), location13, location14);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.Class<?> wildcardClass17 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, (double) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.lang.Class<?> wildcardClass34 = strList33.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((-1), (double) 0L, (double) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation((int) '#', (double) (byte) 1, (double) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.Class<?> wildcardClass20 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(100);
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.util.List<org.example.User> userList27 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.util.List<org.example.User> userList33 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        java.lang.Class<?> wildcardClass38 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        bookingSystem0.registerUser("hi!", "", "", "hi!");
        bookingSystem0.registerDriver("", "hi!", "", "", "", "", "");
        java.util.List<java.lang.String> strList33 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "");
        java.util.List<org.example.User> userList23 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList24 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(driverList24);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (byte) 0);
        org.example.Location location25 = null;
        org.example.Location location26 = null;
        bookingSystem0.bookRide(0, location25, location26);
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Class<?> wildcardClass29 = userList28.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "", "", "");
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) 'a', (double) 10L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(driverList17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        bookingSystem0.updateDriverLocation((int) '4', 10.0d, (double) (byte) -1);
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList10 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.Driver> driverList9 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.updateDriverLocation((-1), (double) 100L, (double) '#');
        org.junit.Assert.assertNotNull(driverList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.util.List<org.example.Driver> driverList29 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList29);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (short) 0, location20, location21);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.lang.Class<?> wildcardClass16 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Class<?> wildcardClass32 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        org.example.Location location29 = null;
        org.example.Location location30 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (byte) 1, location29, location30);
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
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.Class<?> wildcardClass33 = driverList32.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass22 = driverList21.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide(1, location24, location25);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.util.List<org.example.Driver> driverList28 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(driverList28);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        java.lang.Class<?> wildcardClass7 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        bookingSystem0.updateDriverLocation(10, (double) 1L, (double) (byte) 100);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(rideList25);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) 1, location16, location17);
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        bookingSystem0.registerDriver("", "", "hi!", "", "", "", "");
        java.lang.Class<?> wildcardClass42 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList11 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(driverList11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList22 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "", "", "", "hi!", "");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass20 = rideList19.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList12);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (short) -1, location5, location6);
        java.util.List<java.lang.String> strList9 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide((int) (byte) 0, location9, location10);
        java.util.List<org.example.User> userList12 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass15 = rideList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(100);
        org.example.Location location17 = null;
        org.example.Location location18 = null;
        bookingSystem0.bookRide(1, location17, location18);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass23 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass24 = rideList23.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(rideList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.Class<?> wildcardClass32 = userList31.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, 10.0d);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (byte) 100, location26, location27);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        bookingSystem0.bookRide(0, location27, location28);
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.util.List<org.example.User> userList28 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) (-1L), (double) 0L);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.lang.Class<?> wildcardClass19 = rideList18.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 1, 1.0d);
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.example.Location location24 = null;
        org.example.Location location25 = null;
        bookingSystem0.bookRide((int) (byte) 100, location24, location25);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass22 = userList21.getClass();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide((int) (short) -1, location6, location7);
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory(100);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((-1));
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        java.util.List<org.example.Ride> rideList7 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(rideList7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "hi!", "hi!");
        bookingSystem0.registerUser("", "", "hi!", "");
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (byte) -1, location22, location23);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.util.List<org.example.Ride> rideList24 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(rideList24);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.util.List<java.lang.String> strList28 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.util.List<java.lang.String> strList34 = bookingSystem0.getRideHistory((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (byte) 0);
        bookingSystem0.registerDriver("", "", "", "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList22);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.util.List<org.example.User> userList47 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList47);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.Class<?> wildcardClass29 = rideList28.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        bookingSystem0.bookRide(0, location29, location30);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        bookingSystem0.updateDriverLocation(100, (double) 10.0f, (double) 1.0f);
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass21 = userList20.getClass();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((-1));
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide((int) ' ', location13, location14);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass17 = rideList16.getClass();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "", "");
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 10, location7, location8);
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 100, location12, location13);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        bookingSystem0.bookRide((-1), location40, location41);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        bookingSystem0.updateDriverLocation(10, (double) 100.0f, 1.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        bookingSystem0.registerDriver("hi!", "", "", "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        bookingSystem0.updateDriverLocation((int) (short) -1, (double) '#', (double) '#');
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
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("", "", "", "hi!", "hi!", "hi!", "");
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Class<?> wildcardClass26 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100, (double) (short) -1);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 1);
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        bookingSystem0.bookRide((int) ' ', location45, location46);
        java.util.List<org.example.User> userList48 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        bookingSystem0.updateDriverLocation((int) '4', 10.0d, (double) (byte) -1);
        java.util.List<org.example.Ride> rideList9 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass10 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide((int) '#', location14, location15);
        java.util.List<org.example.Driver> driverList17 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(0);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        bookingSystem0.registerDriver("", "hi!", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.Class<?> wildcardClass41 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(driverList32);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        bookingSystem0.bookRide((int) (byte) 0, location35, location36);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.lang.Class<?> wildcardClass37 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList18 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass22 = userList21.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "", "", "");
        java.util.List<java.lang.String> strList20 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.util.List<java.lang.String> strList23 = bookingSystem0.getRideHistory((int) (short) 100);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, (double) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList6 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList7 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        bookingSystem0.updateDriverLocation(100, (double) (short) 1, (double) 10);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList33);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 0, 100.0d);
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Class<?> wildcardClass28 = userList27.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        bookingSystem0.updateDriverLocation(10, (double) '#', (double) (byte) -1);
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((-1));
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        java.util.List<java.lang.String> strList13 = bookingSystem0.getRideHistory((-1));
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(rideList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation(1, (double) 1, (double) '#');
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "");
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.util.List<java.lang.String> strList35 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) '4', 0.0d, 10.0d);
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "");
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide(0, location16, location17);
        java.util.List<org.example.User> userList19 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        java.util.List<org.example.Ride> rideList23 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList14 = bookingSystem0.getRideHistory((int) (short) 100);
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.util.List<org.example.User> userList36 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.lang.Class<?> wildcardClass14 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.lang.Class<?> wildcardClass16 = rideList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.util.List<org.example.Driver> driverList22 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (byte) 10);
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "");
        java.util.List<java.lang.String> strList21 = bookingSystem0.getRideHistory((int) (byte) 0);
        java.util.List<org.example.User> userList22 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        bookingSystem0.bookRide(0, location12, location13);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList13 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        bookingSystem0.registerUser("hi!", "hi!", "hi!", "hi!");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        bookingSystem0.updateDriverLocation((int) (byte) 1, (double) '4', (double) 1L);
        java.lang.Class<?> wildcardClass33 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(driverList15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<org.example.User> userList3 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (short) 1);
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass7 = driverList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.util.List<org.example.Driver> driverList21 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass22 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "");
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 10, 0.0d);
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        java.util.List<java.lang.String> strList7 = bookingSystem0.getRideHistory(0);
        bookingSystem0.updateDriverLocation((-1), (double) (short) 1, 1.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.util.List<org.example.Ride> rideList30 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(driverList21);
        org.junit.Assert.assertNotNull(rideList30);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation(100, (double) '#', (double) 0L);
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(1, (double) '#', (double) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        bookingSystem0.updateDriverLocation((int) (short) 100, 100.0d, (double) 10.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Ride> rideList36 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList36);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        java.util.List<org.example.User> userList10 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList5 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.lang.Class<?> wildcardClass11 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(100, location13, location14);
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 100);
        java.util.List<org.example.User> userList16 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        org.example.Location location5 = null;
        org.example.Location location6 = null;
        bookingSystem0.bookRide((int) (byte) 100, location5, location6);
        java.util.List<java.lang.String> strList9 = bookingSystem0.getRideHistory(10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((int) ' ', (double) 10L, (double) (byte) 10);
        bookingSystem0.registerUser("", "", "hi!", "");
        org.example.Location location23 = null;
        org.example.Location location24 = null;
        bookingSystem0.bookRide((int) (byte) 0, location23, location24);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.Driver> driverList6 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList7 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(driverList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        java.util.List<org.example.User> userList15 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(rideList29);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.util.List<java.lang.String> strList38 = bookingSystem0.getRideHistory(10);
        java.util.List<org.example.User> userList39 = bookingSystem0.getUsers();
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
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        java.util.List<java.lang.String> strList18 = bookingSystem0.getRideHistory((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(0, 0.0d, (double) 0L);
        bookingSystem0.updateDriverLocation((int) '4', (double) 0, 0.0d);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.registerUser("", "", "", "hi!");
        java.util.List<org.example.Driver> driverList25 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList26 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "hi!", "hi!", "hi!", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList14 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(rideList14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("", "", "hi!", "hi!");
        java.util.List<java.lang.String> strList10 = bookingSystem0.getRideHistory((int) (short) 1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) 100.0f, 0.0d);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        org.example.Location location46 = null;
        org.example.Location location47 = null;
        bookingSystem0.bookRide((int) 'a', location46, location47);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.bookRide((int) (short) 1, location23, location24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Location.distanceTo(org.example.Location)\" because \"userLocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        java.lang.Class<?> wildcardClass30 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) (short) 1, 100.0d, (-1.0d));
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        org.example.Location location15 = null;
        org.example.Location location16 = null;
        bookingSystem0.bookRide((int) 'a', location15, location16);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        java.lang.Class<?> wildcardClass34 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(rideList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.util.List<org.example.User> userList31 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(driverList20);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (short) 0, location20, location21);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        java.util.List<java.lang.String> strList27 = bookingSystem0.getRideHistory(100);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(rideList14);
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(driverList25);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.util.List<org.example.User> userList25 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(rideList24);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.Class<?> wildcardClass27 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "", "", "hi!");
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) (short) 1, location22, location23);
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (short) 10, location26, location27);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 0, (double) (-1L));
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        bookingSystem0.updateDriverLocation(0, (double) (-1L), (double) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        bookingSystem0.registerUser("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.util.List<org.example.Ride> rideList34 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(100, (double) (short) 100, 100.0d);
        bookingSystem0.updateDriverLocation((int) (short) 1, (double) 10, (double) 100);
        bookingSystem0.registerDriver("hi!", "hi!", "", "", "", "", "");
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        java.util.List<org.example.User> userList14 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList16 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(driverList16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.util.List<org.example.Ride> rideList43 = bookingSystem0.getRides();
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
        org.junit.Assert.assertNotNull(rideList43);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList8 = bookingSystem0.getRideHistory(1);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) '4');
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.util.List<java.lang.String> strList32 = bookingSystem0.getRideHistory((int) '#');
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "", "", "", "", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList15 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((int) '4');
        java.lang.Class<?> wildcardClass18 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (short) 100);
        org.example.Location location14 = null;
        org.example.Location location15 = null;
        bookingSystem0.bookRide(100, location14, location15);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 100.0f, (double) 0L);
        java.lang.Class<?> wildcardClass15 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        java.util.List<org.example.User> userList9 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (short) 0);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) '4', location21, location22);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.util.List<org.example.Driver> driverList20 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass21 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(driverList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.util.List<org.example.User> userList24 = bookingSystem0.getUsers();
        org.example.Location location26 = null;
        org.example.Location location27 = null;
        bookingSystem0.bookRide((int) (byte) 0, location26, location27);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.lang.Class<?> wildcardClass40 = userList39.getClass();
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        org.example.Location location8 = null;
        org.example.Location location9 = null;
        bookingSystem0.bookRide((int) (byte) 0, location8, location9);
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 100, (double) '4');
        org.example.Location location16 = null;
        org.example.Location location17 = null;
        bookingSystem0.bookRide((int) (byte) 1, location16, location17);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        bookingSystem0.updateDriverLocation((int) '#', (double) 100, (double) 100);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(rideList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        bookingSystem0.registerUser("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(driverList22);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass13 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) '#');
        java.util.List<org.example.User> userList18 = bookingSystem0.getUsers();
        org.example.Location location20 = null;
        org.example.Location location21 = null;
        bookingSystem0.bookRide((int) (byte) -1, location20, location21);
        java.util.List<java.lang.String> strList24 = bookingSystem0.getRideHistory(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        bookingSystem0.registerDriver("", "", "", "hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(driverList19);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.util.List<org.example.Driver> driverList32 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList33 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(driverList32);
        org.junit.Assert.assertNotNull(rideList33);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Driver> driverList19 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList20 = bookingSystem0.getUsers();
        org.example.Location location22 = null;
        org.example.Location location23 = null;
        bookingSystem0.bookRide((int) '4', location22, location23);
        org.junit.Assert.assertNotNull(driverList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.Ride> rideList11 = bookingSystem0.getRides();
        bookingSystem0.registerDriver("hi!", "", "", "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(rideList11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        bookingSystem0.bookRide((int) ' ', location28, location29);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) ' ', (double) 'a');
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        bookingSystem0.registerDriver("", "hi!", "", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(driverList23);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "", "", "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        bookingSystem0.registerUser("", "", "", "");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(rideList10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<org.example.Ride> rideList5 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(rideList12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) 0, (double) 100, (double) (short) -1);
        bookingSystem0.updateDriverLocation(0, (double) (byte) 10, (double) (byte) 10);
        java.lang.Class<?> wildcardClass28 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.Class<?> wildcardClass22 = userList21.getClass();
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        bookingSystem0.registerDriver("", "", "", "", "hi!", "hi!", "");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "", "hi!", "", "hi!", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList14 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) (short) 10);
        bookingSystem0.updateDriverLocation((int) 'a', (double) (byte) 1, 1.0d);
        java.util.List<java.lang.String> strList22 = bookingSystem0.getRideHistory((int) (byte) 1);
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        bookingSystem0.registerDriver("", "hi!", "", "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(driverList14);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory((int) (byte) 10);
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        java.util.List<org.example.User> userList21 = bookingSystem0.getUsers();
        java.lang.Class<?> wildcardClass22 = userList21.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        bookingSystem0.registerUser("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(rideList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        java.lang.Class<?> wildcardClass39 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) 0L, (double) 10L);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        java.lang.Class<?> wildcardClass39 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        bookingSystem0.updateDriverLocation(10, (double) (short) -1, (double) 100L);
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.util.List<org.example.Driver> driverList27 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList11);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(driverList27);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        bookingSystem0.registerDriver("", "hi!", "hi!", "hi!", "", "", "");
        bookingSystem0.updateDriverLocation((int) (short) 10, (double) ' ', (double) 'a');
        java.util.List<org.example.Driver> driverList23 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(driverList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) -1);
        bookingSystem0.updateDriverLocation((int) (byte) 10, (double) (short) -1, 1.0d);
        bookingSystem0.updateDriverLocation((int) 'a', (double) 0.0f, (double) 0.0f);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.Ride> rideList17 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList18 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList17);
        org.junit.Assert.assertNotNull(rideList18);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        bookingSystem0.updateDriverLocation(100, (double) (short) 100, 100.0d);
        java.util.List<java.lang.String> strList17 = bookingSystem0.getRideHistory((-1));
        org.example.Location location19 = null;
        org.example.Location location20 = null;
        bookingSystem0.bookRide((int) (short) 10, location19, location20);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.util.List<org.example.Driver> driverList36 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(driverList36);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        bookingSystem0.registerDriver("hi!", "", "hi!", "hi!", "", "hi!", "hi!");
        bookingSystem0.updateDriverLocation(10, (double) '4', (double) (short) 100);
        java.util.List<org.example.Ride> rideList20 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(rideList20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.updateDriverLocation(0, (double) '4', 0.0d);
        bookingSystem0.updateDriverLocation(10, 0.0d, (double) 10L);
        java.util.List<java.lang.String> strList15 = bookingSystem0.getRideHistory(100);
        java.util.List<org.example.Ride> rideList16 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(rideList16);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.updateDriverLocation((-1), (double) 10L, (double) (-1));
        java.util.List<org.example.User> userList17 = bookingSystem0.getUsers();
        java.util.List<java.lang.String> strList19 = bookingSystem0.getRideHistory((int) '#');
        org.example.Location location21 = null;
        org.example.Location location22 = null;
        bookingSystem0.bookRide((int) (byte) 0, location21, location22);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.util.List<java.lang.String> strList31 = bookingSystem0.getRideHistory((int) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        java.util.List<org.example.User> userList6 = bookingSystem0.getUsers();
        java.util.List<org.example.Driver> driverList7 = bookingSystem0.getDrivers();
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(0, location9, location10);
        java.util.List<org.example.Ride> rideList12 = bookingSystem0.getRides();
        java.util.List<org.example.User> userList13 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(driverList7);
        org.junit.Assert.assertNotNull(rideList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.util.List<org.example.User> userList34 = bookingSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(rideList23);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.Driver> driverList4 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory(0);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        bookingSystem0.registerDriver("hi!", "hi!", "", "hi!", "", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass14 = userList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.lang.Class<?> wildcardClass25 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(rideList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        java.util.List<org.example.User> userList11 = bookingSystem0.getUsers();
        org.example.Location location13 = null;
        org.example.Location location14 = null;
        bookingSystem0.bookRide(1, location13, location14);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        bookingSystem0.updateDriverLocation((int) 'a', (double) '#', (double) (-1.0f));
        org.example.Location location9 = null;
        org.example.Location location10 = null;
        bookingSystem0.bookRide(1, location9, location10);
        java.util.List<org.example.Driver> driverList12 = bookingSystem0.getDrivers();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        bookingSystem0.registerUser("hi!", "", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "hi!");
        org.example.Location location12 = null;
        org.example.Location location13 = null;
        bookingSystem0.bookRide((int) (byte) 1, location12, location13);
        bookingSystem0.updateDriverLocation((int) (byte) 100, (double) 'a', (double) (short) 0);
        java.util.List<org.example.Ride> rideList19 = bookingSystem0.getRides();
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) (byte) 10, (double) 1L);
        java.lang.Class<?> wildcardClass24 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(rideList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        org.example.Location location4 = null;
        org.example.Location location5 = null;
        bookingSystem0.bookRide(1, location4, location5);
        bookingSystem0.updateDriverLocation((int) (short) 0, (double) (-1.0f), (double) (-1L));
        bookingSystem0.updateDriverLocation((int) (short) 0, 100.0d, 100.0d);
        java.util.List<java.lang.String> strList16 = bookingSystem0.getRideHistory((int) '4');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        bookingSystem0.registerUser("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(rideList34);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        bookingSystem0.registerUser("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(rideList5);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(rideList19);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.util.List<java.lang.String> strList29 = bookingSystem0.getRideHistory((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList17);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        bookingSystem0.bookRide((int) (short) 10, location29, location30);
        org.junit.Assert.assertNotNull(rideList18);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.util.List<org.example.Ride> rideList15 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(driverList10);
        org.junit.Assert.assertNotNull(rideList15);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<java.lang.String> strList4 = bookingSystem0.getRideHistory(0);
        java.util.List<java.lang.String> strList6 = bookingSystem0.getRideHistory((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.Class<?> wildcardClass29 = bookingSystem0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(rideList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        java.util.List<org.example.Driver> driverList5 = bookingSystem0.getDrivers();
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        java.util.List<java.lang.String> strList12 = bookingSystem0.getRideHistory((int) (byte) 100);
        bookingSystem0.updateDriverLocation((int) (short) -1, 1.0d, (double) '4');
        org.example.Location location18 = null;
        org.example.Location location19 = null;
        bookingSystem0.bookRide((int) (short) 100, location18, location19);
        org.junit.Assert.assertNotNull(driverList5);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        java.util.List<org.example.Ride> rideList27 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(driverList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(rideList26);
        org.junit.Assert.assertNotNull(rideList27);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        org.example.Location location2 = null;
        org.example.Location location3 = null;
        bookingSystem0.bookRide((int) (short) 0, location2, location3);
        org.example.Location location6 = null;
        org.example.Location location7 = null;
        bookingSystem0.bookRide(0, location6, location7);
        bookingSystem0.registerUser("", "hi!", "", "");
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "", "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<java.lang.String> strList5 = bookingSystem0.getRideHistory((int) (byte) -1);
        org.example.Location location7 = null;
        org.example.Location location8 = null;
        bookingSystem0.bookRide((int) (byte) 0, location7, location8);
        java.util.List<java.lang.String> strList11 = bookingSystem0.getRideHistory((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        bookingSystem0.updateDriverLocation((int) (byte) -1, (double) 0.0f, (double) 10L);
        org.junit.Assert.assertNotNull(driverList9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "hi!", "hi!", "", "hi!", "hi!", "");
        bookingSystem0.registerUser("hi!", "", "hi!", "hi!");
        bookingSystem0.registerUser("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.util.List<org.example.Ride> rideList26 = bookingSystem0.getRides();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(driverList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(rideList26);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.util.List<org.example.User> userList35 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("", "", "hi!", "", "hi!", "", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.example.BookingSystem bookingSystem0 = new org.example.BookingSystem();
        java.util.List<java.lang.String> strList2 = bookingSystem0.getRideHistory((int) '4');
        java.util.List<org.example.Driver> driverList3 = bookingSystem0.getDrivers();
        java.util.List<org.example.User> userList4 = bookingSystem0.getUsers();
        bookingSystem0.registerDriver("hi!", "", "hi!", "", "hi!", "", "hi!");
        java.util.List<org.example.Driver> driverList13 = bookingSystem0.getDrivers();
        java.lang.Class<?> wildcardClass14 = driverList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(driverList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(driverList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        bookingSystem0.registerUser("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(rideList15);
        org.junit.Assert.assertNotNull(strList17);
    }
}

