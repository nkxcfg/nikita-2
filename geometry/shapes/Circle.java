package shapes;

public class Circle extends Rectangle {
    private double radius;

    /**Constructor for using all required fields.
     * @param x1 is x coordinate of center of the circle.
     * @param y1 is y coordinate of center of the circle.
     * @param radius is a radius of the circle.
     */
    public Circle(double x1, double y1, double radius) {
        super(x1,y1);
        this.radius = radius;
    }

    /**Constructor by default.
     */
    public Circle() {
        this.radius = 0;
    }

    /**Perimeter a square of the circle.
     * @return perimeter.
     */
    @Override
    public double perimeter() {
        double perimeter = Math.PI*radius*2;
        return perimeter;
    }

    /**Determines is a point located inside the circle.
     * @param mx - x coordinate of the point.
     * @param my - y coordinate of the point.
     * @return isInside - true if the point is located inside the circle.
     */
    @Override
    public boolean isInside(int mx, int my) {
        boolean isInside = false;
        if ((mx - getX())*(mx - getX()) + (my - getY())*(my - getY()) <= radius*radius ){
            isInside = true;
        };
        return isInside;
    }

    /**Creates the Rectangle which contains the Circle.
     * @param obj is a Circle object.
     * @return a Rectangle.
     */
    public Rectangle boundingBox(Circle obj){
        Rectangle a = new Rectangle (getX(),getY(),radius/(Math.sqrt(2)/2));
        return a;
    }
}