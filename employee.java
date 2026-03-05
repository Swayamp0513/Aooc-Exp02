// Problem 1:
// Create a class called Employee that includes first name, last name, and monthly salary.
// If salary is not positive, set it to 0.0.
// Create two Employee objects and display yearly salary.
// Then give each a 10% raise and display again.

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;
        if(s > 0)
            monthlySalary = s;
        else
            monthlySalary = 0.0;
    }

    // Getter and Setter
    public double getSalary() {
        return monthlySalary;
    }

    public void setSalary(double s) {
        if(s > 0)
            monthlySalary = s;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", "Sharma", 20000);
        Employee e2 = new Employee("Amit", "Patil", 25000);

        System.out.println("Yearly Salary:");
        System.out.println(e1.getName() + ": " + e1.getSalary() * 12);
        System.out.println(e2.getName() + ": " + e2.getSalary() * 12);

        // 10% raise
        e1.setSalary(e1.getSalary() * 1.10);
        e2.setSalary(e2.getSalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println(e1.getName() + ": " + e1.getSalary() * 12);
        System.out.println(e2.getName() + ": " + e2.getSalary() * 12);
    }
}