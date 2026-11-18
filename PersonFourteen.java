class PersonFourteen {
    private String name; private int age;
    static int peopleCount = 0;
    static final String INSTITUTION = "ABC College";
    PersonFourteen(String name, int age) {
        this.name = name; this.age = age; peopleCount++;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    void displayDetails() { System.out.println("Name: " + name + ", Age: " + age); }
    void displayDetails(String label) { System.out.print(label + " "); displayDetails(); }
    static class Department {
        private String departmentName;
        Department(String name) { departmentName = name; }
        void display() { System.out.println("Department: " + departmentName); }
    }
}
class StudentFourteen extends PersonFourteen {
    private String course; private int year;
    StudentFourteen(String name, int age, String course, int year) {
        super(name, age); this.course = course; this.year = year;
    }
    @Override void displayDetails() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() +
                ", Course: " + course + ", Year: " + year);
    }
}
class FacultyFourteen extends PersonFourteen {
    private String subject; private double salary;
    FacultyFourteen(String name, int age, String subject, double salary) {
        super(name, age); this.subject = subject; this.salary = salary;
    }
    @Override void displayDetails() {
        System.out.println("Faculty: " + getName() + ", Subject: " + subject + ", Salary: " + salary);
    }
}
class AdministratorFourteen extends PersonFourteen {
    private String role;
    AdministratorFourteen(String name, int age, String role) {
        super(name, age); this.role = role;
    }
    @Override void displayDetails() {
        System.out.println("Administrator: " + getName() + ", Role: " + role);
    }
}
class Program14CollegeManagementDemo {
    public static void main(String[] args) {
        PersonFourteen[] people = {
                new StudentFourteen("Nisha", 20, "BCA", 2),
                new FacultyFourteen("Dr. Kumar", 42, "Java", 65000),
                new AdministratorFourteen("Ramesh", 45, "Office Manager")
        };
        for (PersonFourteen p : people) p.displayDetails();
        people[0].displayDetails("College record:");
        PersonFourteen.Department d = new PersonFourteen.Department("Computer Science");
        d.display();
        System.out.println("Institution: " + PersonFourteen.INSTITUTION);
        System.out.println("Total people: " + PersonFourteen.peopleCount);
    }
}
