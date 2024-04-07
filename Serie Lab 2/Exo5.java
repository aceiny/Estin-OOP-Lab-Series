/*
Exercise 5: Encapsulation
- Modify the `x` and `y` fields in the `Point` class to be `private`. Then, provide public getter and setter
methods (`getX()` and `getY()`, `setX(int x)` and `setY(int y)`) to access and modify these fields respectively.
Update method calls in the class to use these getters and setters.
*/
class PointExo5 {
    private int x ;
    private int y ;
    public PointExo5(){
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void display(){
        System.out.println("Point is at (" + this.x + ", " + this.y + ")");
    }
}
public class Exo5 {
    public static void main(String[] args){
        PointExo5 p = new PointExo5();
        p.setX(3);
        p.setY(4);
        System.out.println("Point is at (" + p.getX() + ", " + p.getY() + ")"); 
        p.display();
    }
}