/*
Exercise 1: Inner Classes, Enumerations, Serialization and Streams
Define a class `Department` that contains an inner class `Employee` and an enumeration `DepartmentType`.
Implement serialization and deserialization of an instance of the `Department` class to a file called
`department.ser`. */
import java.io.*;

public class Exo1 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private DepartmentType type;
    private Employee employee;

    // Constructor
    public Department(String name, DepartmentType type, Employee employee) {
        this.name = name;
        this.type = type;
        this.employee = employee;
    }

    // Inner class Employee
    public class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int id;

        // Constructor
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                   "name='" + name + '\'' +
                   ", id=" + id +
                   '}';
        }
    }

    // Enumeration DepartmentType
    public enum DepartmentType {
        HR, IT, SALES, MARKETING
    }

    @Override
    public String toString() {
        return "Department{" +
               "name='" + name + '\'' +
               ", type=" + type +
               ", employee=" + employee +
               '}';
    }

    // Serialization method
    public static void serialize(Department department, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(department);
            System.out.println("Serialization successful: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization method
    public static Department deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println("Deserialization successful: " + filename);
            return (Department) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Create an instance of Department and Employee
        Department department = new Department("IT Department", DepartmentType.IT, department.new Employee("Alice", 123));

        // Serialize the Department object to a file
        String filename = "department.ser";
        serialize(department, filename);

        // Deserialize the Department object from the file
        Department deserializedDepartment = deserialize(filename);
        System.out.println("Deserialized Department: " + deserializedDepartment);
    }
}
