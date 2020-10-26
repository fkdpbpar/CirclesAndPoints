package package2;

public class Point {
    private int x;
    private int y;
    
    
    //Copy Constructor
    public Point(Point oldPoint){
        this.x = oldPoint.getX();
        this.y = oldPoint.getY();
    }
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int timi){
        this.x = timi;
    }
    public int getX(){
        return x;
    }
    public void setY(int timi){
        y = timi;
    }
    public int getY(){
        return y;
    }
}
