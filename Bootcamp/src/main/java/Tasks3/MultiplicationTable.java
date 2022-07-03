package Tasks3;

import java.util.Arrays;

public class MultiplicationTable {
    // array and stores a multiplication table (from 1 - 10) in it
    public static void main(String[] args) {
        int [][] table = new int[10][10];

        for (int row = 0; row < table.length; row++){//adding numbers to table
            for (int column = 0; column < table[row].length; column++){
                table [row][column] = (row+1)  * (column+1);
                System.out.printf("%6d",table [row][column]);
            }
            System.out.println();
        }
    }


}
