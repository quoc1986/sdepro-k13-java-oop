package lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        float changeWeight;
        System.out.println("Please input your height(m):");
        Scanner scanner = new Scanner(System.in);
        float height = scanner.nextFloat();
        System.out.println("Please input your weight(kg):");
        float weight = scanner.nextFloat();
        //Caculate BMI
        if (height > 0 && weight > 0) {
            System.out.println("Calculate your BMI");
            float bmi = weight / (height * 2);
            System.out.println("Your BMI:" + bmi);
            float expectedMinWeight = 18.5f * height * 2 ;
            float expectedMaxWeight = 24.9f * height * 2;
            if (bmi < 18.5) {
                changeWeight = expectedMinWeight - weight;
                System.out.println("Underweight, You should increase " + changeWeight + "to be normal");
            } else if (bmi <= 24.9) {
                System.out.println("Normal weight");
            } else if (bmi <= 29.9) {
                changeWeight = weight - expectedMaxWeight;
                System.out.println("Overweight, You should decrease " + changeWeight + "to be normal");
            } else {
                changeWeight = weight - expectedMaxWeight;
                System.out.println("Obesity, You should decrease " + changeWeight + "to be normal");
            }
        }
    }

}
