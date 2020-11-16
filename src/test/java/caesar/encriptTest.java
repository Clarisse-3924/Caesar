package caesar;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class encriptTest {

    @Test
    public void newRectangle_instantiatesCorrectly() {
        encript testRectangle = new rectangle(2, 4);
        assertEquals(true, testRectangle instanceof rectangle);
    }
}