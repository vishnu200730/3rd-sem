package q1;

import java.util.Scanner;

class Student {
    String USN, Name, Branch;
    String Phone;

    Student(String USN, String Name, String Branch, String Phone) {
        this.USN = USN;
        this.Name = Name;
        this.Branch = Branch;
        this.Phone = Phone;
    }

    void display() {
        System.out.println(USN + "\t" + Name + "\t" + Branch + "\t" + Phone);
    }
}

public class StudentProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter USN: ");
            String usn = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            s[i] = new Student(usn, name, branch, phone);
        }

        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("USN\tName\tBranch\tPhone");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}
