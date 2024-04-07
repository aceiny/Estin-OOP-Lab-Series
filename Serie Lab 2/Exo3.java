/*
Exercise 3: Access Modes
- Modify the `x` and `y` fields in the `Point` class to have different access modifiers (e.g., `private`, `public`).
Try accessing these fields from outside the class and observe the results of the compilation.
 */
class POintExo3 {
    private int x ; 
    protected int y ; 
    public int z ;
    public POintExo3(int x , int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void display(){
        System.out.println("Point is at (" + this.x + ", " + this.y + ")");
    }
}
public class Exo3 {
    public static void main(String[] args) {
        POintExo3 p = new POintExo3(3, 4, 5);
        p.display();
        // System.out.println(p.x); // error: x has private access in Point
        // System.out.println(p.y); // error: y has protected access in Point
        System.out.println(p.z);
    }
}