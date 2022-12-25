package lab_03;

public class lab_03_3 {
    public static void main(String[] args) {
        int intArr[]={12, 34, 1, 16, 28};
        for(int i=0;i<intArr.length-1;i++){
            for(int j=i+1;j<intArr.length;j++)
            {
                if(intArr[j]<intArr[i]){
                    int temp=intArr[i];
                    intArr[i]=intArr[j];
                    intArr[j]=temp;
                }
            }
        }
        for(int number:intArr){
            System.out.print(number+" ");
        }
    }
}
