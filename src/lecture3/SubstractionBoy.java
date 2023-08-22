package Lecture3;

import java.util.Scanner;

public class SubstractionBoy{

    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() * 7 % 10);
        Scanner sc = new Scanner(System.in);
        num1 = 8;
        num2 = 2;
        System.out.println("what is" + num1 + "-" + num2 + "?");
        int answer = sc.nextInt();
        System.out.println(num1 + "_" + num2 + "=" + answer + "is" + (num1 - num2 == answer));

    }

}
