package Tasks3;

import java.util.Random;

public class RandomNumberArray {
    //array with four arbitrary whole numbers
    public static void main(String[] args) {
        int [] array = new int[4];
        Random random= new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        for (int arr : array){
            System.out.println(arr);
        }
    }
}
