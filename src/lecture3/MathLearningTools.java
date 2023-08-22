
package lecture3;

import java.util.Scanner;

public class MathLearningTools {

    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("what is " + num1 + "-" + "" + num2 + "?");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (num1 - num2 == answer) {
            System.out.println("you are correct");
        } else {
            System.out.println("your answer is wrong" + num1 + "-" + num2 + "should be equal" + (num1 - num2));
        }

    }
}
