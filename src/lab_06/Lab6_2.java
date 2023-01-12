package lab_06;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        int count=0;
        String password="";
        do{
            System.out.println("Please input password!");
            Scanner scanner= new Scanner(System.in);
            password=scanner.nextLine();
            count++;
        }
        while (count<3);
    }

}
