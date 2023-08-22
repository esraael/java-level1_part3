package Lecture3;

import java.util.Scanner;

public class AndOr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("true");
        } else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("false");
        } else if (num % 2 == 0 ^ num % 3 == 0) {
            System.out.println("good");
        }

    }

}
