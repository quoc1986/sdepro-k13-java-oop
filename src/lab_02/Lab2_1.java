package lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        System.out.println("Please input your height(m):");
        Scanner scanner=new Scanner(System.in);
        float height=scanner.nextFloat();
        System.out.println("Please input your weight(kg):");
        float weight=scanner.nextFloat();
        System.out.println("Calculate your BMI");
        float bmi=weight/(height*2);
        if(bmi<18.5){
            System.out.println("You are under weight! You should increase your weight!");
        }
        else if(bmi<29.9)
        {
            System.out.println("Overweight! You should decrease your weight!");
            if(bmi<24.9)
            System.out.println("Congratulate! Normal weight");
        }
        else {
            System.out.println("Obesity! You should decrease your weight!");
        }

    }
}
