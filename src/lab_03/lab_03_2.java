package lab_03;

public class lab_03_2 {
    public static void main(String[] args) {
        int intArr[]={77,3,68,33,56};
        int minValue=intArr[0];
        int maxValue = intArr[0];
        for(int i=1;i<intArr.length;i++){
            if(intArr[i]<=minValue)
                minValue=intArr[i];
            if(intArr[i]>maxValue)
                maxValue=intArr[i];
        }
        System.out.println("Max value:"+maxValue);
        System.out.println("Min value:"+minValue);
    }
}
