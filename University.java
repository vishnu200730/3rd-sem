class University {

    String universityName = "VTU";

    // Static nested class
    static class Department {
        String deptName = "Computer Science";

        void displayDepartment() {
            System.out.println("Department: " + deptName);
        }
    }

    // Non-static inner class
    class Faculty {
        String facultyName = "Ramesh";
        String designation = "Professor";

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }

    // Outer class method
    void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }
}
class UniversityMain {
    public static void main(String[] args) {

        // Creating University object
        University u = new University();

        // Creating static nested class object
        University.Department d =
                new University.Department();

        // Creating non-static inner class object
        University.Faculty f = u.new Faculty();

        // Displaying details
        u.displayUniversity();
        d.displayDepartment();
        f.displayFaculty();
    }
}