import org.junit.Test;
import static org.junit.Assert.*;

public class TestExample {
    //Make assertions that the expected value matches the actual value
    @Test
    public void myFirstTest(){
//assertEquals: compare 2 values that are exactly the same
//              assertion verifies that the expected value and the actual value are equal
        String company = "Codeup";
        assertEquals("Codeup", company);
//        assertEquals("codeup", company);
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

}
