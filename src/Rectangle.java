import processing.core.PApplet;


public class Rectangle extends Shape {

    private double length, height;
    private final double PERIMETER_MULTIPLIER = 2;
    Rectangle(Point upperLeft, double length, double height) {
        super();
        this.position = upperLeft;
        this.length = length;
        this.height = height;
    }

    @Override
    public void draw(PApplet p, float x, float y, float l, float w) {
        p.rect( x, y,l,w);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeArea() {
        return length * height;
    }

    public double getPerimeter() {
        return PERIMETER_MULTIPLIER * (length + height);
    }

    public String getType() {
        return "Rectangle";
    }

}