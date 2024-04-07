/*
Exercise 1: Procedural Programming and OOP
- Write a program that demonstrates the difference between procedural programming and OOP. Create a
procedural program that manipulates the point (3,4) and moves it to the point (5,7) using separate functions for
initialization, movement, and display. Then, create an OOP version of the same program using the `Point` class
seen in the course.
*/
class PointExo1 {
    private int x;
    private int y;
    public PointExo1(int x , int y){
        this.x = x;
        this.y = y;
    }   
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("oop : Point is at (" + x + ", " + y + ")");
    }
}
public class Exo1 {
    static int x;
    static int y;

    public static void initialize(int x, int y) {
        Exo1.x = x;
        Exo1.y = y;
    }

    public static void move(int x, int y) {
        Exo1.x = x;
        Exo1.y = y;
    }

    public static void display() {
        System.out.println("procedural : Point is at (" + x + ", " + y + ")");
    }
    public static void main(String[] args){
        //start of procedural part
       initialize(3, 4);
       display();
       move(5, 7);
       display();
       // end of procedural part
       // start of oop part
       PointExo1 p = new PointExo1(3, 4);
        p.display();
        p.move(5, 7);
        p.display();
       // end of oop part

    }
}