import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int year;
    String studentID;
    String courses = "";
    int tuitionBalance = 0;
    int costOfCourse = 600;
    int id = 1000;


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student's year: ");
        this.year = in.nextInt();

        setStudentID();

    }

    public void setStudentID() {
        id++;
        this.studentID = year + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (enter Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                this.courses = courses + "\n  " + course;
                this.tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }

        } while (1 != 0);

    }

    public void getBalance() {
        System.out.println("Your balance is $ " + tuitionBalance);
    }

    public void payTuition() {
        getBalance();
        System.out.print("Enter a payment amount: $ ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
        getBalance();
    }

    public void showStudentInfo() {
        System.out.println(
                "Name: " + firstName + " " + lastName + "\nStudent ID: " + studentID + "\nBalance: $" + tuitionBalance + " \nCourses: " + courses);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of students you want to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}


