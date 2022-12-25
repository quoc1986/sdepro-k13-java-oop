package lab_03;

public class lab_03_1 {
    public static void main(String[] args) {
        int countEven=0;
        int countOdd=0;
        int[] intArr1= {1, 12, 16, 27, 34};
        for(int number:intArr1){
            if(number%2==0){
                countEven++;
            }
            else
                countOdd++;
        }
        System.out.println("Even:"+countEven);
        System.out.println("Odd:"+countOdd);
    }
}
