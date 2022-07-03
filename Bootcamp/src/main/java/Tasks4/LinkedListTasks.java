package Tasks4;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String[] args) {

    //Write a Java program to append the specified element to the end of a linked list.
    LinkedList<String> colors = new LinkedList<String>();
        colors.add("white");
        colors.add("Black");
        colors.add("Green");
        colors.add("blue");
        System.out.println(colors);

        colors.addLast("red");
        //Write a Java program to iterate through all elements in a linked list.

//        for (int i = 0; i < colors.size(); i++) {
//            System.out.println(colors.get(i));
//        }
        // Write a Java program to iterate through all elements in a linked list starting at the specified position.
//        for (int i = 2; i < colors.size(); i++) {
//            System.out.println(colors.get(i));
//        }
        for (String element : colors) {
            System.out.println(element);
        }

        Iterator iterator = colors.listIterator(1);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Write a Java program to iterate a linked list in reverse order.
        Iterator desIterator = colors.descendingIterator();

        while (desIterator.hasNext()){
            System.out.println(desIterator.next());
        }

        //Write a Java program to insert the specified element at the specified position in the linked list.
        colors.add(1,"Pink");





}
}
