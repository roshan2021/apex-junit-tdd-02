import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

//    @Before
//    public void setUp(){
//        assertEquals(null, CodeupCrypt.hash);
//    }

    @Test
    public void testIfHashPasswordSetsHash(){
        CodeupCrypt.hashPassword("roshan");
        assertEquals("r0sh4n", CodeupCrypt.hash);
        assertEquals("c0d39p", CodeupCrypt.hashPassword("codeup") );
    }

    @Test
    public void testIfCheckPasswordWorks(){
        assertTrue(CodeupCrypt.checkPassword("roshan", "r0sh4n"));
    }

}
