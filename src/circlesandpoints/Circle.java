package circlesandpoints;

import package2.Point;

public class Circle {
    private int radius;
    private Point point;
    private static int counter;
    
    public Circle(){
        point = new Point(0,0);
    }
    public Circle(int radius, Point p){
        this.radius = radius;
        this.point = p;
    }
    
    public void setPoint(Point p){
        this.point = p;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public Point getPoint(){
        return this.point;
    }
    public int getRadius(){
        return this.radius;
    }
    
    
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    public void printDetails(){
        System.out.printf("Circle details: Point=(x:%d,y:%d), radius=%d\n", point.getX(), point.getY(), radius);
    }
    
}
