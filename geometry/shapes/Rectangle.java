package shapes;

/**Rectangle, count perimeter, move, determines is a point located inside a rectangle.
 * @author nikita.kazakov
 *
 */
public class Rectangle {
    private double x1;
    private double y1;
    private double height;
    private double width;

    /** Constructor for using all required fields.
     * 
     */
    public Rectangle(double x1, double y1, double height, double width) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.width = width;
    }

    /**Constructor for coordinates only.
     *
     */
    public Rectangle(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = 0;
        this.width = 0;
    }

    /**Constructor by default.
     * 
     */
    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.height = 0;
        this.width = 0;
    }
    
    /**Perimeter of rectangle.
     * 
     * @return perimeter.
     */
    public double perimeter() {
        double perimeter = 2 * height + 2 * width;
        return perimeter;
    }

    /**Determines is a point located inside a rectangle.
     * @param mx - x coordinate of the point.
     * @param my - y coordinate of the point.
     * @return isInside - true if the point is located inside the rectangle.
     */
    public boolean isInside(int mx, int my) {
        boolean isInside = false;
        if (mx > x1 && mx < x1+width && my < y1 && my > y1 - height ){
            isInside = true;
        };
        return isInside;
    }

    /**Move rectangle.
     * @param mx - x coordinate of next location.
     * @param my - y coordinate of next location.
     */
    public void move(int mx, int my) {
        this.x1 = mx;
        this.y1 = my;
    }
    
    /**Get x coordinate of rectangle.
     * @return x coordinate of rectangle.
     */
    double getX (){
        return x1;
    }

    /**Get y coordinate of rectangle.
     * @return y coordinate of rectangle.
     */
    double getY (){
        return y1;
    }

    /**Get height of rectangle.
     * @return height.
     */
    double getHeight (){
        return height;
    }

    /**Get width of rectangle.
     * @return width
     */
    double getWidth (){
        return width;
    }
}
