package lab_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number%2==0){
            System.out.println("Even number");
        }
        else
            System.out.println("Odd number");
    }
}
