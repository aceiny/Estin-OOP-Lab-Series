/*
Exercise 1: Inheritance
1. Define a base class `Point` with attributes `x` and `y`, along with methods `display()` to display the
coordinates.
2. Create a derived class `PointCol` that inherits from `Point` and adds an additional attribute `colour`
representing the colour of the point.
3. Implement a method `colorise(String colour)` in `PointCol` to set the colour of the point.
4. Demonstrate inheritance by creating an object of `PointCol`, invoking methods from both `Point` and
`PointCol`, and displaying the coordinates along with the colour.
*/
class PointExo1 {
    private int x;
    private int y;
    public PointExo1(int x , int y){
        this.x = x;
        this.y = y;
    }  
    public void display(){
        System.out.print("Point is at (" + this.x + ", " + this.y + ") ");
    }
}
class PointExo1Col extends PointExo1{
    private String colour ; 
    public PointExo1Col(int x, int y ,String colour){
        super(x , y);
        this.colour = colour;
    }
    public void colorise(String colour){
        this.colour = colour;
    }
    public void display(){
        super.display();
        System.out.println("Colour of the point is " + this.colour);
    }
}
public class Exo1 { 
    public static void main(String[] args){
        PointExo1Col p = new PointExo1Col(1,1,"red");
        p.display();
        p.colorise("blue");
        p.display();
    }
}