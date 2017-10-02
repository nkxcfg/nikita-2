package shapes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCircle {

    private double delta = 0.1;
    Circle test3 = new Circle (2,4,5);

    @Test
    public void perimeter() {
        assertEquals(31.4, test3.perimeter(),delta);
    }

    @Test
    public void isInside () {
        assertEquals(true, test3.isInside(3,5));
    }

    @Test
    public void isNotInside () {
        assertEquals(false, test3.isInside(8,5));
    }

    @Test
    public void move () {
        test3.move(10,11);
        assertEquals(10, test3.getX(),delta);
        assertEquals(11, test3.getY(),delta);
    }

    @Test
    public void smallestRectangle () {
        Rectangle uno = test3.boundingBox (test3);
        assertEquals(2, uno.getX(),delta);
        assertEquals(4, uno.getY(),delta);
        assertEquals(10, uno.getWidth(),delta);
        assertEquals(10, uno.getHeight(),delta);
    }
}