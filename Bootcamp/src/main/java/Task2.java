import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value b: ");
        int b = scanner.nextInt();
        System.out.println("Enter b1: ");
        boolean b1 = scanner.nextBoolean();
        System.out.println("Enter b2 ");
        boolean b2 = scanner.nextBoolean();
//        System.out.println("Is b1 and b2 equal? -" + (b1 == b2));
        System.out.println("Enter number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter number: ");
        int inputNumber2 = scanner.nextInt();

        compareNumbers(a, b);
        compareBoolean(b1, b2);
        System.out.println("Enter boolean value: ");
        boolean b3 = scanner.nextBoolean();
        System.out.println(wholeNumber(inputNumber));
        System.out.println(oddNumber(inputNumber2));
        changeBoolean(b3);
        numberConditions();

    }

    static String compareNumbers(int a, int b) {
        if (a == b) {
            return "is " + a + " equal to " + b + "? -" + true;
        } else if (a <= b) {
            return "is " + a + " less than " + b + "? -" + true;
        } else if (a < b) {
            return "is " + a + " less or equal to " + b + "? -" + true;
        } else if (a > b) {
            return "is " + a + " greater or equal to " + b + "? -" + true;
        }else{
            return "false";
        }
    }

    static boolean compareBoolean(boolean b1, boolean b2) {
        return b1 == b2;
    }

    static boolean wholeNumber(int inputNumber) {
        return inputNumber % 2 == 0;
    }

    static boolean oddNumber(int inputNumber) {
        return inputNumber % 2 != 0;
    }

    static boolean changeBoolean(boolean b1) {
        boolean b2=false;
        return b1!=b2;
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

    public static int sum(int a, int b) {
        a = 10;
        b = 11;
        int sum = a + b;
        return sum;
    }

}
