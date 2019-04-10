import org.junit. *;
import static org.junit.Assert.*;


public class CaeserCypherTest {
    @Test
    public void encryptCode() {
        CaeserCypher encryptCode = new CaeserCypher();
        assertEquals("cd", encryptCode.encryptCode("ab" ,3));
    }


}