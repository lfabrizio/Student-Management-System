package com.fabrizio;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    //constructor prompts user name and year
        public Student(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Students first name : " );
            this.firstName = in.nextLine();

            System.out.print("Enter Students last name : " );
            this.lastName = in.nextLine();

            System.out.print("1: Freshman\n 2: Sophmore\n 3: Junior\n 4: Senior\n Enter class level" );
            this.gradeYear = in.nextInt();

            setStudentID();

        }
    // generate an id
    private void setStudentID(){
            // grade level + static id
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // enroll in courses
    public void enroll(){
            // get inside a loop
        do {
            System.out.print("Enter Course to Enroll (Q to Quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);

    }


    // balance
    public void viewBalance(){
        System.out.println("Your balance is: $ " + tuitionBalance);
    }

    // tuition
    public void payTuition(){
            viewBalance();
        System.out.println("Enter your payment: $");
            Scanner in = new Scanner(System.in);
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // status of student
    public String toString(){
           return "Name" + firstName + " " + lastName +
                   "\nGrade Level: " + gradeYear +
                   "\nStudent ID: " + studentID +
                   "\nCourses Enrolled: " + courses +
                   "\nBalance: $" + tuitionBalance;
    }
}
