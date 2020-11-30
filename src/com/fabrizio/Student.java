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

            System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

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
        System.out.println("Enter Course to Enroll (Q to Quit)");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if(course != "Q"){
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance " + tuitionBalance);
    }


    // balance and tuition

    // status of student
}
