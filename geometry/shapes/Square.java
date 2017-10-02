package shapes;

public class Square extends Rectangle{
    private double side;
    /**Constructor for using all required fields.
     * @param x1 is x coordinate of upper left corner of square.
     * @param y1 is x coordinate of upper left corner of square.
     * @param side is a side of square
     */
    public Square(double x1, double y1, double side) {
        super(x1,y1);
        this.side = side;
    }

    /**Constructor by default.
     * 
     */
    public Square() {
        super();
        this.side = 0;
    }

    /**Counts a perimeter of square.
     * @return perimeter
     */
    @Override
    public double perimeter() {
        double perimeter = side * 4;
        return perimeter;
    }

    /**Determines is a point located inside a square
     * @param dx - x coordinate of the point
     * @param dy - y coordinate of the point
     * @return isInside - true if the point is located inside the square
     */
    @Override
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if (dx > getX() && dx < getX()+side && dy < getY() && dy > getY() - side ){
            isInside = true;
        };
        return isInside;
    }
}
