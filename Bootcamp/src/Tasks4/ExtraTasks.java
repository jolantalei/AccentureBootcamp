package Tasks4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ExtraTasks {

    public static void main(String[] args) {
        // 1. declare and initialize String array with 7 arbitrary colors.
// 2. Create new list "colors" (ArrayList) of type String
// 3. Copy/add all elements from String array to colors list
// 4. Remove 3rd element from colors list
// 5. Add new color at the end of the colors list
// 6. Add new color at the beginning of the colors list
// 7. Loop through colors list and output all values (use for each loop)
// 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
// index 2 to index 5)
//    (hint: take a look at List interface and find a method which you can use to achieve this)
// 9. Use for loop to output each element of colorsSublist list


        String [] arrayColors = {"red","green","black","white","blue","pink","grey"};
        ArrayList <String> arrayListColors = new ArrayList<String>();
        Collections.addAll(arrayListColors,arrayColors);
        System.out.println(arrayListColors);
        arrayListColors.remove(3);
        System.out.println(arrayListColors);
        arrayListColors.add("brown");
        System.out.println(arrayListColors);
        arrayListColors.add(0,"caramel");
        System.out.println(arrayListColors);
        for (String col : arrayListColors){
            System.out.println(col);
        }



    }
}
