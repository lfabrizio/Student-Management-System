package com.fabrizio;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;
    //constructor prompts user name and year
        public Student(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Students first name : " );
            this.firstName = in.nextLine();

            System.out.print("Enter Students last name : " );
            this.lastName = in.nextLine();

            System.out.print("Enter Students grade level: " );
            this.gradeYear = in.nextLine();
        }
    // generate an id

    // enroll in courses

    // balance and tuition

    // status of student
}
