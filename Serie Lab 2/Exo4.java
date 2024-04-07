/*
Exercise 4: Usage Conventions and constructors
- Follow Java naming conventions and refactor the `init`, `move`, and `display` methods to start with
lowercase letters (e.g., `init` becomes `initialize`, `move` becomes `moveTo`, `display` becomes `displayInfo`).
Update method calls accordingly and a constructor.
*/
class PointExo4 {
    private int x;
    private int y;
    public PointExo4(int x , int y){
        this.x = x;
        this.y = y;
    }   
    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void displayInfo(){
        System.out.println("Point is at (" + x + ", " + y + ")");
    }
}
public class Exo4 {
    public static void main(String[] args){
        PointExo4 p = new PointExo4(3, 4);
        p.displayInfo();
        p.moveTo(5, 7);
        p.displayInfo();
    }
}