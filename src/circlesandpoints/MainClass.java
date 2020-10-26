package circlesandpoints;

import java.util.ArrayList;
import package2.Point;

/** @author user */
public class MainClass {

    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, -2);
        Point p3 = p1;
        Point p4 = new Point(p1);
        p1.setX(1000);
        
        Circle c1 = new Circle(5, p1);
        System.out.print("C1 details:");
        c1.printDetails();
        //Circle c2 = new Circle(1, p2);
        Circle c3 = new Circle(3, p4);
        System.out.println("**********");
        System.out.print("C1 details:");
        c1.printDetails();
        //c2.printDetails();
        System.out.print("C3 details:");
        c3.printDetails();
        System.out.println("*********");
        System.out.println("Circle c1 perimeter:"+c1.getPerimeter());
        //System.out.println("Circle c2 perimeter:"+c2.getPerimeter());
        System.out.println("*****Setting p1 to x=200****");
        p1.setX(200);
        System.out.print("C1 details:");
        c1.printDetails();
        System.out.print("C3 details:");
        c3.printDetails();
    }
    
    public static void addPointsToList(){
        ArrayList<Point> list = new ArrayList();
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, -2);
        list.add(p1);
        list.add(p2);
    }

}
