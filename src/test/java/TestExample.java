
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
}
