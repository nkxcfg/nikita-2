package shapes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRectangle {
    private double delta = 0.1;
    Rectangle test1 = new Rectangle (3,6,8,9);
    @Test
    public void perimeter() {
        assertEquals(34, test1.perimeter(),delta);
    }
    @Test
    public void isInside () {
        assertEquals(true, test1.isInside(4,5));
    }
    @Test
    
    public void isNotInside () {
        assertEquals(false, test1.isInside(9,12));
    }
    @Test
    public void move () {
        test1.move(10,11);
        assertEquals(10, test1.getX(),delta);
        assertEquals(11, test1.getY(),delta);
    }
}
