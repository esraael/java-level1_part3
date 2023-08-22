package Lecture3;

import java.util.Scanner;

public class MidAddition {

    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() * 7 % 10);
        Scanner sc = new Scanner(System.in);
        num1 = 9;
        num2 = 7;
        System.out.println("what is" + num1 + " +" + num2 + "=?");
        int answer = sc.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + answer + "is" + (num1 + num2 == answer));
    }

}
