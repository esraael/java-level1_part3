package Lecture3;

import java.util.Scanner;

public class EvenHieven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Hieven");
        } else if (num % 5 == 0) {
            System.out.println("HIfive");
        }
    }

}
