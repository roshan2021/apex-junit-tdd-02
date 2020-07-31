import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

    @Test
    public void testIfSumWorks(){

        assertEquals(20, MyMath.sum(15,5));
        assertEquals(150, MyMath.sum(50,100));
    }

    @Test
    public void testIfSubtractWorks(){
        assertEquals(7.8, MyMath.subtract(10.0, 2.2), 0);
    }

}
