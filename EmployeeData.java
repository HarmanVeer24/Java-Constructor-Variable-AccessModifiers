public class EmployeeData {
    public static void main(String[] args) {
        // Create an Object of Employee class
        Employee employee = new Employee(10, "Web", 50000);

        // Display employee details
        employee.displayDetails();

        // Modify EmployeeSalary
        employee.setEmployeeSalary(60000);

        // Display updated employee details
        System.out.println("After Updating EmployeeSalary:");
        employee.displayDetails();

        // Create an object of Manager
        Manager manager = new Manager(102, "HR", 100000, 7000);

        // Display manager details
        manager.displayManagerDetails();
    }
}

class Employee {
    public int employeeID;
    protected String EmployeeDepartment;
    private double EmployeeSalary;
    // Constructor
    Employee(int employeeID, String EmployeeDepartment, double EmployeeSalary) {
        this.employeeID = employeeID;
        this.EmployeeDepartment = EmployeeDepartment;
        this.EmployeeSalary = EmployeeSalary;
    }

    // Public method to modify EmployeeSalary
    public void setEmployeeSalary(double EmployeeSalary) {
        if(EmployeeSalary > 0) {
            this.EmployeeSalary = EmployeeSalary;
            System.out.println("EmployeeSalary Updated to: " + EmployeeSalary);
        }
        else {
            System.out.println("Invalid EmployeeSalary");
        }
    }

    // Public method to get EmployeeSalary
    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("EmployeeDepartment: " + EmployeeDepartment);
        System.out.println("EmployeeSalary: " + EmployeeSalary);
        System.out.println();
    }
}

// Child class
class Manager extends Employee {
    // Variable
    private final double bonus;

    // Constructor
    Manager(int employeeID, String EmployeeDepartment, double EmployeeSalary, double bonus) {
        super(employeeID, EmployeeDepartment, EmployeeSalary);
        this.bonus = bonus;
    }

    // Method to calculate EmployeeSalary with bonus
    public double calculateEmployeeSalary() {
        return getEmployeeSalary() + bonus;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("EmployeeDepartment: " + EmployeeDepartment); // Protected variable (Accessible in subclass)
        System.out.println("EmployeeSalary: " + getEmployeeSalary()); // Private Variable accessed using getter method
        System.out.println("Bonus: " + bonus);
        System.out.println("Total EmployeeSalary: " + calculateEmployeeSalary());
    }
}
//output
//Employee ID: 10
//EmployeeDepartment: Web
//EmployeeSalary: 50000.0
//
//EmployeeSalary Updated to: 60000.0
//After Updating EmployeeSalary:
//Employee ID: 10
//EmployeeDepartment: Web
//EmployeeSalary: 60000.0
//
//Manager Details:
//Employee ID: 102
//EmployeeDepartment: HR
//EmployeeSalary: 100000.0
//Bonus: 7000.0
//Total EmployeeSalary: 107000.0