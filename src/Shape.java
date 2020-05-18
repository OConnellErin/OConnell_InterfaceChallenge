import processing.core.PApplet;

abstract class Shape extends PApplet {

    protected Point position;
    private static int numShapes;
    private int id;

    public Shape(){
        ++Shape.numShapes;
    }

    public Point getPosition() {
        return position;
    }

    public static int getNumShapes() {
        return numShapes;
    }

    public int getID() {
        return id;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public static void setNumShapes(int numShapes) {
        Shape.numShapes = numShapes;
    }

    public void setID(int id) {
        this.id = id;
    }
    public String getType(){
        return getClass().getName();
    }

    public String toString(){
        return "Type: " + getType() + "\nArea: " + computeArea() + "\nPerimeter: " + getPerimeter();
    }

    public void toCompare(Shape x, Shape y){
        if (x.computeArea()> y.computeArea()){
            System.out.println(x);
            System.out.println(y);
        }
        else if (x.computeArea()<y.computeArea()){
            System.out.println(y);
            System.out.println(x);
        }
        else{
            if(x.getPerimeter()>y.getPerimeter()){
                System.out.println(x);
                System.out.println(y);
            }
            else {
                System.out.println(y);
                System.out.println(x);
                 }
            }
        }

    abstract public double computeArea();
    abstract public double getPerimeter();
    abstract  public void draw(PApplet p,float x, float y, float l, float w);



}