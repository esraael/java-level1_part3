package Lecture3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int years = sc.nextInt();
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("this is leap year");
        } else {
            System.out.println("not leap year");
        }

    }

}
