import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestExample {

    List<String> names;

    @Before
    public void setUP(){
        names = new ArrayList<>();
        names.add("Roshan");
    }



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
        boolean var = 1 == 0;
       assertFalse(var);
        //assertFalse(1 != 0);
    }

    //the following arrays are not the same (objects) vs (values)
    //Lists are objects that represent many values
    @Test
    public void testIfListsAreNotTheSame(){
        List<String> language = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(language, moreLanguages);

        //sidenote: languages.get(0); languages.get(1); represents "values" || "elements and
        //would use assertNotEquals since it is not objects being compared, but values
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfWordContains(){
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

    @Test
    public void testArraysAreEqual(){
        int[] numbers = {789, 567, 22033};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 789;
        otherNumbers[1] = 567;
        otherNumbers[2] = 22033;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfRoshanIsInList(){
        assertEquals("Roshan", names.get(0));
        assertNotEquals("roshan", names.get(0));
        assertTrue(names.contains("Roshan"));
        assertFalse(names.contains("Josh"));
        assertEquals(1, this.names.size());
        this.names.add("Lauren");
        assertEquals(2, this.names.size());
        assertSame("Lauren", this.names.get(1));
    }

    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

}
