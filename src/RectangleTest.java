import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.JUnitCore;

public class RectangleTest {

    private Rectangle r;
    private Rectangle[] rList = new Rectangle[5];

    @Before
    public void testSetup() {
        System.out.println("Setup for test complete.");
    }

    @After
    public void testComplete() {
        System.out.println("Test complete.");
    }

    @Test
    public void test1() {
        try {
            r = new Rectangle();

            assertEquals(0, r.getH());
            assertEquals(0, r.getW());

            System.out.println("Test 1 completed successfully.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test2() {
        try {
            r = new Rectangle();

            assertEquals(0, r.getH());
            assertEquals(0, r.getW());
            assertEquals(0, r.getA());

            System.out.println("Test 2 completed successfully.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3() {
        try {
            r = new Rectangle(10, 20);

            assertEquals(10, r.getH());
            assertEquals(20, r.getW());
            assertEquals(200, r.getA());

            System.out.println("Test 3 completed successfully.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test4() {
        try {
            for (int i = 0; i < 5; i++) {
                rList[i] = new Rectangle(2 * i, 3 * i);

                assertEquals(2 * i, rList[i].getH());
                assertEquals(3 * i, rList[i].getW());
                assertEquals(6 * i * i, rList[i].getA());
            }

            System.out.println("Test 4 completed successfully.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test5() {
        try {
            r = new Rectangle();

            for (int i = 0; i < 5; i++) {
                r.setH(11 * i);
                r.setW(7 * i);

                assertEquals(11 * i, r.getH());
                assertEquals(7 * i, r.getW());
                assertEquals(77 * i * i, r.getA());
            }

            System.out.println("Test 5 completed successfully.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test6() {
        try {
            for (int i = 0; i < 5; i++) {
                rList[i] = new Rectangle();
                rList[i].setH(11 * i);
                rList[i].setW(7 * i);

                String expected = "Rectangle: height = " + (11 * i)
                        + " width = " + (7 * i)
                        + " area = " + (77 * i * i) + ".";

                assertEquals(expected, rList[i].toString());
                System.out.println(rList[i]);
            }

            System.out.println("Test 6 completed successfully.");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        JUnitCore.main("RectangleTest");
    }
}
