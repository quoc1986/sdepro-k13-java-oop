package lab_03;

public class lab_03_4 {
    public static void main(String[] args) {
        int[] foo = { 3, 7, 9,11,84 };
        int[] bar = { 4, 8, 11 };

        int fooLength = foo.length;
        int barLength = bar.length;

        int[] merged = new int[fooLength + barLength];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while(fooPosition < fooLength && barPosition < barLength) {
            if (foo[fooPosition] < bar[barPosition]) {
                merged[mergedPosition++] = foo[fooPosition++];
            } else {
                merged[mergedPosition++] = bar[barPosition++];
            }
        }

        while (fooPosition < fooLength) {
            merged[mergedPosition++] = foo[fooPosition++];
        }

        while (barPosition < barLength) {
            merged[mergedPosition++] = bar[barPosition++];
        }
        for(int number:merged){ System.out.print(number+" ");
     }
    }
}
