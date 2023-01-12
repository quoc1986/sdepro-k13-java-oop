package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("Please enter an option!");
        Scanner scanner= new Scanner(System.in);
        int option= scanner.nextInt();
        List<Integer> myArrayList=new ArrayList<>();
        myArrayList.add(4);
        myArrayList.add(66);
        myArrayList.add(89);
        myArrayList.add(12);
        switch (option){
            case 1:
                myArrayList.add(7);
                System.out.println(myArrayList);
                break;
            case 2:
                System.out.println("Print numbers:");
                System.out.println(myArrayList);
                break;
            case 3:
                System.out.println("Find maximum number:");
                int max= myArrayList.get(0);
                for (int i = 1; i < myArrayList.size(); i++) {
                    if(myArrayList.get(i)>max)
                        max=myArrayList.get(i);
                }
                System.out.println("Max number:"+max);
                break;
            case 4:
                System.out.println("Find maximum number:");
                int min= myArrayList.get(0);
                for (int i = 1; i < myArrayList.size(); i++) {
                    if(myArrayList.get(i)<min)
                        max=myArrayList.get(i);
                }
                System.out.println("Max number:"+min);
                break;

            case 5:
                System.out.println("Please enter a number:");
                int number= scanner.nextInt();
                System.out.println("Index of number in List:"+myArrayList.indexOf(number));
        }
    }
}
