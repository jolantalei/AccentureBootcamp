package Tasks4;

import java.util.ArrayList;

public class ArrayListTasks {
    public static void main(String[] args) {
        //Write a Java program to create a new array list, add some colors (string) and print out the collection
        ArrayList <String> colors = new ArrayList<String>();
        colors.add("white");
        colors.add("black");
        colors.add("green");
        System.out.println(colors);
        //Write a Java program to iterate through all elements in a array list.
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
        //Write a Java program to insert an element into the array list at the first position
        colors.add(1,"red");

        //Write a Java program to retrieve an element (at a specified index) from a given array list
        colors.get(2);
        //Write a Java program to update specific array element by given element.
        colors.set(2,"grey");
        //Write a Java program to remove the third element from a array list
        colors.remove(2);
        //Write a Java program to search an element in a array list

            if (colors.contains("red")){
                System.out.println("found:");
            }else {
                System.out.println("not found");
            }
        }


    }





