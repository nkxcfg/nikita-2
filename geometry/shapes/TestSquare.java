package shapes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSquare {
	private double delta = 0.1;
    Square test2 = new Square (4,6,7);

    @Test
    public void perimeter() {
        assertEquals(28, test2.perimeter(),delta);
    }
    @Test
    public void isInside () {
        assertEquals(true, test2.isInside(5,3));
    }
    @Test
    public void isNotInside () {
        assertEquals(false, test2.isInside(-1,5));
    }
    @Test
    public void move () {
        test2.move(10,11);
        assertEquals(10, test2.getX(),delta);
        assertEquals(11, test2.getY(),delta);
    }
}
