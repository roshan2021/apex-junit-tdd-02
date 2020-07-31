import org.junit.Test;
import static org.junit.Assert.*;

public class TestExample {
    //Make assertions that the expected value matches the actual value
    @Test
    public void myFirstTest(){
    //assertEquals: compare 2 values that are exactly the same
    //assertion verifies that the expected value and the actual value are equal
        String company = "Codeup";
        assertEquals("Codeup", company);
        //assertEquals("codeup", company);
    }

    //When using floating values, Delta is a 3rd parameter required representing a positive margin of error
    // of decimals
    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price -discount, 0.5);
    }

    //assertNotSame to verify 2 variables don't refer to the same object
    //assertSame to verify 2 variables refer to the same object

    @Test
    public void testIfObjectsAreDifferent(){
        //dog class and sheep class
        Object dog = new Object();
        Object sheep = new Object();

        System.out.println("dog.toString() = " + dog.toString());
        System.out.println("sheep.toString() = " + sheep.toString());

        Object clonnedSheep = sheep;

        System.out.println("clonnedSheep.toString = " + clonnedSheep.toString());

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals(){
     //assertArrayEquals method checks 2 object arrays are equal or not. If not
     //, it throws an Exception
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char [] actual = "Junit".toCharArray();

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void testIfBooleansWork(){
        assertTrue("F".equals("F"));
        assertFalse(1 == 0);
    }

}
