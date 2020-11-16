package caesar;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class encriptTest {
    @Test
    public void newRectangle_instantiatesCorrectly() {
        rectangle testRectangle = new rectangle(2, 4);
        assertEquals(true, testRectangle instanceof rectangle);
    }

    @Test
    public void newRectangle_getsHeight_2() {
        rectangle testRectangle = new rectangle(2, 4);
        assertEquals(2, testRectangle.getHeight());
    }

    @Test
    public void getWidth_getsRectangleWidth_4() {
        rectangle testRectangle = new rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }

}