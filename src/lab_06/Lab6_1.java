package lab_06;

public class Lab6_1 {
    public static void main(String[] args) {
        String myString = "2hrs and 5 minutes";
        int indexOfHour = myString.indexOf("hrs") - 1;
        int hour = Character.getNumericValue(myString.charAt(indexOfHour));
        int indexOfMinutes = myString.indexOf("minutes") - 2;
        int minutes = Character.getNumericValue(myString.charAt(indexOfMinutes));
        minutes=hour*60+minutes;
        System.out.println(minutes);
    }
}
