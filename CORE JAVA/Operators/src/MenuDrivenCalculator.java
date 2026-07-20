public class MenuDrivenCalculator {

    public static void main(String[] args) {

        int choice = 1;

        int num1 = 25;
        int num2 = 5;

        System.out.println("=================================");
        System.out.println("         JAVA CALCULATOR");
        System.out.println("=================================");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("=================================");
        System.out.println("Selected Option : " + choice);
        System.out.println();

        if (choice == 1) {

            System.out.println("Addition = " + (num1 + num2));

        } else if (choice == 2) {

            System.out.println("Subtraction = " + (num1 - num2));

        } else if (choice == 3) {

            System.out.println("Multiplication = " + (num1 * num2));

        } else if (choice == 4) {

            System.out.println("Division = " + (num1 / num2));

        } else if (choice == 5) {

            System.out.println("Modulus = " + (num1 % num2));

        } else {

            System.out.println("Invalid Choice");

        }

    }
}