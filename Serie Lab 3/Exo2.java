/*
Exercise 2: Derived Classes, Access Modes, Override, and Overload

1. Understanding Access Modes:
A. Create a base class `Vehicle` with attributes `model` and `year` and a method `displayInfo()` to display
vehicle information.
B. Derive a class `Car` from `Vehicle` with additional attribute `fuelEfficiency` per 100 km and a method
`calculateFuelConsumption()` to calculate fuel consumption.
C. Implement the access mode `protected` and use it to protect the `model` attribute of `Vehicle` so that it
can be accessed by subclasses but not directly by other classes.
D. Demonstrate the use of access modes by trying to access the `model` attribute directly from the `Main`
class.

2. Override and Overload:
A. Override the `displayInfo()` method in the `Car` class to display additional information about the car.
B. Overload the `displayInfo()` method in the `Vehicle` class to display information based on different
parameters like `model` and `year`.
C. Demonstrate the use of override and overload by creating objects of `Vehicle` and `Car` classes and
invoking the `displayInfo()` method with different parameters.
*/ 
class Vehicle {
    protected String model;
    private int year;
    protected Vehicle(String model, int year){
        this.model = model;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Model: " + this.model + ", Year: " + this.year);
    }
    public void displayInfo(String model){
        System.out.println("Model: " + this.model);
    }
    public void displayInfo(int year){
        System.out.println("Year: " + this.year);
    }
}
class Car extends Vehicle {
    private double fuelEfficiency;
    public Car(String model, int year, double fuelEfficiency){
        super(model, year);
        this.fuelEfficiency = fuelEfficiency;
    }
    public void calculateFuelConsumption(double distance){
        System.out.println("Fuel consumption for " + distance + " km: " + (distance / 100) * this.fuelEfficiency + " L");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fuel Efficiency: " + this.fuelEfficiency + " L/100 km");
    }
}
public class Exo2 {
    public static void main(String[] args){
        Car c = new Car("Toyota", 2020, 5.5);
        // System.out.println(c.model); // Compilation error: model has protected access in Vehicle
        c.displayInfo();
        c.calculateFuelConsumption(100);
        Vehicle v = new Vehicle("Toyota", 2020);
        v.displayInfo();
        v.displayInfo("show model");
        v.displayInfo(0);
    }
}