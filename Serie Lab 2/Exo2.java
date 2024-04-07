/*
Exercise 2: Abstraction
- Write a method `calculateDistanceTo(Point other)` in the `Point` class that calculates the distance between the
current point and another point passed as an argument. Use this method to calculate and display the distance
between the current point and itself then between the current point and point(9,3).
*/
class PointExo2 {
    private int x;
    private int y;
    public PointExo2(int x , int y){
        this.x = x;
        this.y = y;
    }
    public double calculateDistanceTo(PointExo2 otherPoint){
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }
}
public class Exo2 {
    public static void main(String[] args) {
        PointExo2 p = new PointExo2(3, 4);
        System.out.println("Distance between p and p: " + p.calculateDistanceTo(p));
        PointExo2 p2 = new PointExo2(9, 3);
        System.out.println("Distance between p and p2: " + p.calculateDistanceTo(p2));
    }
}