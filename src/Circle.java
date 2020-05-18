import processing.core.PApplet;


public class Circle extends Shape {

    private double radius;
    private final double PERIMETER_MULTIPLIER = 2;

    public Circle(Point center, double radius) {
        super();
        this.radius = radius;
        this.position = center;
    }

    @Override
    public void draw(PApplet p,float x, float y, float l, float w) {
        ellipse(x,y,l,w);
    }

    public double computeArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return PERIMETER_MULTIPLIER*Math.PI*radius;
    }

    public String getType() {
        return "Circle";
    }
}