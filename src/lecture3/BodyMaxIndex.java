package lecture3;

import java.util.Scanner;

public class BodyMaxIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your weight in pound");
        double weight = sc.nextDouble();
        System.out.println("enter your hieght in inch");
        double hieght = sc.nextDouble();
        final double kilogram_per_pound = 0.45359237;
        final double meter_per_inch = 0.0254;
        double weightinkilogram = weight * kilogram_per_pound;
        double hieghtinmeter = hieght * meter_per_inch;
        double bmi = weightinkilogram * (hieghtinmeter) * (hieghtinmeter);
        System.out.println("bmi is" + bmi);
        if (bmi < 18.5) {
            System.out.println("under weight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("over weight");
        } else {
            System.out.println("opese");
        }
    }
}
