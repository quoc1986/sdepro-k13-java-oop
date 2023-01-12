package lab_06;

public class Lab6_1 {
    public static void main(String[] args) {
        String myString="2hrs and 5 minutes";
        int hour=Integer.valueOf(myString.substring(0,1));
        int minutes=Integer.valueOf(myString.substring(9,10));
        minutes=hour*60+minutes;
        System.out.println(minutes);
    }
}
