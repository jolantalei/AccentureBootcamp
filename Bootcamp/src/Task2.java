import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        compareNumbers();
        compareBoolean();
        wholeNumber();
        oddNumber();
        changeBoolean();
        numberConditions();

    }

    static void compareNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value b: ");
        int b = scanner.nextInt();

        boolean a1 = true;
        boolean b1 = false;

        System.out.println("is " + a+ " equal to " + b +"? -" + ((a == b) ? a1 : b1));
        System.out.println("is " + a+ " less than " + b +"? -" + ((a < b) ? a1 : b1));
        System.out.println("is " + a+ " less or equal to " + b +"? -" + ((a <= b) ? a1 : b1));
        System.out.println("is " + a+ " greater than " + b +"? -" + ((a > b) ? a1 : b1));
        System.out.println("is " + a+ " greater or equal to " + b +"? -" + ((a >= b) ? a1 : b1));
    }

    static void compareBoolean() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter b1: ");
        boolean b1 = scanner.nextBoolean();
        System.out.println("Enter b2 ");
        boolean b2 = scanner.nextBoolean();
        System.out.println("Is b1 and b2 equal? -" + (b1 == b2));
    }

    static void wholeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber % 2 == 0);
    }

    static void oddNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber % 2 != 0);
    }

    static void changeBoolean() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter boolean value: ");
        boolean b1 = scanner.nextBoolean();
        System.out.println("Opposite of " + b1 + " is " + !b1);

    }

    static void numberConditions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value b: ");
        int b = scanner.nextInt();

        boolean a1 = true;
        boolean b1 = false;

        if (a == b || (a < 0 && b > 0) || (a > 100 && b > 100)) {
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }
    }

}
