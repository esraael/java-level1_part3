package lecture3;

import java.util.Scanner;

public class lottary2 {

    public static void main(String[] args) {
        int lottary = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num of lottary");
        int guess = sc.nextInt();
        int lottarydigit1 = lottary / 10;
        int lottarydigit2 = lottary % 10;
        int guessdigit1 = guess / 10;
        int guessdigit2 = guess % 10;
        System.out.println("the lottary is" + lottary);

        if (guess == lottary) {
            System.out.println("exact match you win $10,000");
        } else if (guessdigit1 == lottarydigit2 && guessdigit2 == lottarydigit1) {
            System.out.println("match all digit you win $3,000");
        } else if (guessdigit1 == lottarydigit1 || guessdigit1 == lottarydigit2
                || guessdigit2 == lottarydigit1 || guessdigit2 == lottarydigit2) {
            System.out.println("match one digit you win $1,000");
        } else {
            System.out.println("sorry no match");
        }

    }

}
