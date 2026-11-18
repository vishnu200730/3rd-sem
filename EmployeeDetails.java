public class EmployeeDetails {

    // Parent class
    static class Employee {
        int employeeId;
        String name;
        double basicSalary;

        Employee(int employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.basicSalary = basicSalary;
        }

        double calculateSalary() {
            return basicSalary;
        }

        void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Basic Salary: " + basicSalary);
        }
    }

    // Permanent Employee subclass
    static class PermanentEmployee extends Employee {
        double allowance;
        double bonus;

        PermanentEmployee(int employeeId, String name,
                          double basicSalary,
                          double allowance, double bonus) {

            super(employeeId, name, basicSalary);

            this.allowance = allowance;
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return basicSalary + allowance + bonus;
        }
    }

    // Contract Employee subclass
    static class ContractEmployee extends Employee {
        int hoursWorked;
        double hourlyRate;

        ContractEmployee(int employeeId, String name,
                         int hoursWorked, double hourlyRate) {

            super(employeeId, name, 0);

            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        double calculateSalary() {
            return hoursWorked * hourlyRate;
        }
    }

    // Main method
    public static void main(String[] args) {

        PermanentEmployee p = new PermanentEmployee(
                101, "Ravi", 30000, 5000, 3000);

        ContractEmployee c = new ContractEmployee(
                102, "Rani", 100, 200);

        System.out.println("Permanent Employee Details");
        p.displayDetails();
        System.out.println("Total Salary: " + p.calculateSalary());

        System.out.println("\nContract Employee Details");
        c.displayDetails();
        System.out.println("Total Salary: " + c.calculateSalary());
    }
}

