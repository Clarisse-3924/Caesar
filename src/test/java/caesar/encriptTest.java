package caesar;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class encriptTest {
    @Test
    public void newEncrypt_instantiatesCorrectly() {
        encript testEncrypt = new encript("clarisse", 3);
        assertEquals(true, testEncrypt instanceof encript);
    }
    @Test
    public void newEncript_getsText() {
        encript testEncrypt = new encript("clarisse", 3);
        assertEquals("clarisse", testEncrypt.getText());
    }
    @Test
    public void getEncript_getsShiftkey() {
        encript testEncrypt = new encript("clarisse", 3);
        assertEquals(3, testEncrypt.getShiftkey());
    }
}