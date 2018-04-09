import java.util.Arrays;

public class ArrayValueHandling {

    public static void main(String[] args) {

        int[] intArray = new int[10];
        int sum = 0;
        int numberEvens = 0;
        int sumShorterArray = 0;
        int shortArrayCounter = 0;

        //1.
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
            //2.
            sum += intArray[i];
            //3.
            if (i % 2 == 0) {
                numberEvens++;
            }
        }
        //4.
        double average = sum / intArray.length;

        //a.
        for (int i = 1; i < intArray.length - 1; i++) {
            shortArrayCounter++;
            sumShorterArray += intArray[i];
        }
        double shorterArrayAverage = sumShorterArray / shortArrayCounter;

        //b.
        Arrays.sort(intArray);
        double median;
        if (intArray.length % 2 == 0) {
            median = ((double) intArray[intArray.length / 2] + (double) intArray[intArray.length / 2 - 1]) / 2;
        }else {
            median = (double) intArray[intArray.length/2];
        }
        System.out.println(median);
    }
}
