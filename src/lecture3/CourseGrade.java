package Lecture3;

import java.util.Scanner;

public class CourseGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your grade");
        int grade = sc.nextInt();
        if (grade >= 85) {
            System.out.println("your course grade is A");
        } else if (grade >= 75 && grade < 85) {
            System.out.println("your course grade is B");
        } else if (grade >= 65 && grade < 75) {
            System.out.println("your course grade is C");
        } else if (grade >= 50 && grade < 65) {
            System.out.println("your course grade is D");
        } else if (grade < 50) {
            System.out.println("your course grade is F");
        }

    }

}
