import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {
ArrayList<Shape> shapes = new ArrayList<>();
    Shape rectangle;
    Shape rectangle1;
    Shape rectangle2;
    Shape rectangle3;
    Shape rectangle4;
    Shape rectangle6;
    Shape rectangle7;
    Shape rectangle8;
    Shape rectangle9;
    Shape rectangle10;



    public void settings(){
        size(500,500);
    }

    @Override
    public void setup() {
        rectangle = new Rectangle(new Point(1.0,1.0), 50.0,50.0);
        rectangle1 = new Rectangle(new Point(50.0,50.0), 50.0,50.0);
        rectangle2 = new Rectangle(new Point(100,100),50,50);
        rectangle3 = new Rectangle(new Point(150,150), 50,50);
        rectangle4 = new Rectangle((new Point(200,200)),50,50);
        rectangle6 = new Rectangle((new Point(250,250)),50,50);
        rectangle7 = new Rectangle((new Point(300,300)),50,50);
        rectangle8 = new Rectangle((new Point(350,350)),50,50);
        rectangle9 = new Rectangle((new Point(400,400)),50,50);
        rectangle10 = new Rectangle((new Point(450,450)),50,50);

    }

    @Override
    public void draw() {
       rectangle.draw( this, (float)rectangle.getPosition().getX(), (float)rectangle.getPosition().getY() , rectangle.height , rectangle.width);
       rectangle1.draw( this, (float)rectangle1.getPosition().getX(), (float)rectangle1.getPosition().getY() , rectangle1.height , rectangle1.width);
       rectangle2.draw( this, (float)rectangle2.getPosition().getX(), (float)rectangle2.getPosition().getY() , rectangle2.height , rectangle2.width);
       rectangle3.draw( this, (float)rectangle3.getPosition().getX(), (float)rectangle3.getPosition().getY() , rectangle3.height , rectangle3.width);
       rectangle4.draw( this, (float)rectangle4.getPosition().getX(), (float)rectangle4.getPosition().getY() , rectangle4.height , rectangle4.width);
        rectangle6.draw( this, (float)rectangle6.getPosition().getX(), (float)rectangle6.getPosition().getY() , rectangle6.height , rectangle6.width);
        rectangle7.draw( this, (float)rectangle7.getPosition().getX(), (float)rectangle7.getPosition().getY() , rectangle7.height , rectangle7.width);
        rectangle8.draw( this, (float)rectangle8.getPosition().getX(), (float)rectangle8.getPosition().getY() , rectangle8.height , rectangle8.width);
        rectangle9.draw( this, (float)rectangle9.getPosition().getX(), (float)rectangle9.getPosition().getY() , rectangle9.height , rectangle9.width);
        rectangle10.draw( this, (float)rectangle10.getPosition().getX(), (float)rectangle10.getPosition().getY() , rectangle10.height , rectangle10.width);


    }
}
