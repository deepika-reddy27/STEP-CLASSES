import java.util.Scanner;

class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(
            empId + " | " +
            empName + " | Rs " +
            salary + " | Intern: " +
            isIntern
        );
    }
}

public class M3_EmployeeProfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Permanent employee
        System.out.print("Enter Permanent Employee ID: ");
        String permanentId = sc.nextLine();

        System.out.print("Enter Permanent Employee Name: ");
        String permanentName = sc.nextLine();

        System.out.print("Enter Permanent Employee Salary: ");
        double permanentSalary = sc.nextDouble();

        sc.nextLine();

        Employee permanent = new Employee(
            permanentId,
            permanentName,
            permanentSalary
        );

        System.out.print("Enter Intern Employee ID: ");
        String internId = sc.nextLine();

        System.out.print("Enter Intern Employee Name: ");
        String internName = sc.nextLine();

        Employee intern = new Employee(
            internId,
            internName
        );

        System.out.println("\nEmployee Profiles:");

        permanent.printProfile();
        intern.printProfile();

        sc.close();
    }
}