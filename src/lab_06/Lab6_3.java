package lab_06;

public class Lab6_3 {
    public static void main(String[] args) {
        String myString="12345nabc678";
        char[] myCharacter=myString.toCharArray();
        char[] coppyNumber=new char[100];
        int i=0;
        for(char mychar:myCharacter){
            if(Character.isDigit(mychar)){
               coppyNumber[i++]=mychar;
            }
        }
        String str = String.valueOf(coppyNumber);
        System.out.println(str);
    }
}
