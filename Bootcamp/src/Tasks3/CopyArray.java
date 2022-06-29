package Tasks3;

import java.util.Random;

public class CopyArray {
    public static void main(String[] args) {


        int[] arrayFirst = new int[4];
        int[] arraySecond = new int[arrayFirst.length];

        Random random = new Random();

        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.print(arrayFirst[i] = random.nextInt(10));
        }
        System.out.println();
        for (int j = 0; j < arraySecond.length; j++) {
            System.out.print(arraySecond[j] = arrayFirst[j]);
        }
    }

}
