public class Rectangle extends Shape {
    private double width, length;


    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0)
            throw new IllegalArgumentException("width and length cant be less than 0!");

        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
