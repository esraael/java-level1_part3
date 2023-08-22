package lecture3;

import java.util.Scanner;

public class Lottary {

    public static void main(String[] args) {
        int lottary = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");

        int guess = sc.nextInt();
        if (guess > lottary) {
            System.out.println("guess too very large");
        } else if (guess < lottary) {
            System.out.println("guess too very small");
        } else {
            System.out.println("you win");
        }

    }

}
