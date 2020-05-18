import processing.core.PApplet;
public class Main {
    private final static String[] OPTIONS= new String[] {"--present","Sketch"};
    public static void main(String[] args) {
        PApplet.main(OPTIONS);

        Circle circle1 = new Circle(new Point(1.0, 1.0), 1.0);
        Circle circle2 = new Circle(new Point(1.0, 1.0), 2.0);

        Rectangle rectangle = new Rectangle(new Point(0.0, 1.0), 1.0, 1.0);

        // Print areas
        System.out.println("Area of circle 1 is: " + circle1.computeArea());
        System.out.println("Area of circle 2 is: " + circle2.computeArea());
        System.out.println("Area of rectangle is: " + rectangle.computeArea());
        System.out.println();

        // Print positions
        System.out.println("Circle 1 is at: (" + circle1.getPosition().getX() + ", " + circle1.getPosition().getY() + ")");

        System.out.println("Rectangle is at: (" + rectangle.getPosition().getX() + ", " + rectangle.getPosition().getY() + ")");
        System.out.println();

        //Add code to determine how many shapes you've made so far
        System.out.println("The total number of shapes made so far: " + Shape.getNumShapes());
        System.out.println(circle1);

        circle1.toCompare(circle1,circle2);
    }
}