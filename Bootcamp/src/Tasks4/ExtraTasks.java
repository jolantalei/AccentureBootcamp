package Tasks4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ExtraTasks {

    public static void main(String[] args) throws IOException {
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
        List<String> arrayListColor2 = arrayListColors.subList(2,5);
        System.out.println(arrayListColor2);
        // Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
        //Think of how you could use any of the Set implementation to implement
        //this program.

        // Bonus:
        // Ignore case sensitivity. For example, Apple and apple should be counted as the same word.
        //Hint: to get the text as an String array can be regular expression used e.g.: String[] words = Text.TEXT.split("\\s+");
        FileWriter myWriter = new FileWriter("C:\\Users\\jolan\\IdeaProjects\\Bootcamp\\src\\Tasks4\\TestFile.txt");
        myWriter.close();



    }
}
