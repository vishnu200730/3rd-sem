class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        System.out.println("Person constructor called");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Employee inherits Person
class Employee extends Person {
    int empId;
    double basicSalary;

    Employee(String name, int age, int empId, double basicSalary) {
        super(name, age);

        System.out.println("Employee constructor called");
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Manager inherits Employee
class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, int age, int empId,
            double basicSalary, String department, double bonus) {

        super(name, age, empId, basicSalary);

        System.out.println("Manager constructor called");
        this.department = department;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class MainPerson {
    public static void main(String[] args) {

        Manager m = new Manager(
                "Naveen", 22, 101, 30000, "IT", 10000
        );

        System.out.println("\n--- Manager Details ---");
        m.display();
    }
}
