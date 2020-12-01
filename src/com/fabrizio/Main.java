package com.fabrizio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // project


        // Asking how many students we want to add
        System.out.println("Enter number of new Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create a number of new students
        for(int n = 0;n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
        for(int n = 0;n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
