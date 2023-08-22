package Lecture3;

import java.util.Scanner;

public class YearAnimals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your years");

        int years = sc.nextInt();
        switch (years) {

            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            default:
                System.out.println("cow");
        }
    }

}
