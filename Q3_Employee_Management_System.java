import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Q3_Employee_Management_System {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        

        employees.add(new Employee(101, "Venkatesh", 50000));
        employees.add(new Employee(102, "Rahul", 60000));
        employees.add(new Employee(103, "Rohit", 55000));
        

        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
