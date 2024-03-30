package Arithmetic;

import java.util.Scanner;

public class AritMain {
    static Number num1, num2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the data type for num1:");
        int choice1 = getUserChoice();

        num1 = getUserInput(choice1, 1);

        System.out.println("Enter the data type for num2:");
        int choice2 = getUserChoice();

        num2 = getUserInput(choice2, 2);

        Arithmetic<Number> a = new Arithmetic<>(num1, num2);

        System.out.println("\nAdd: " + a.add());
        System.out.println("Subtract: " + a.subtract());
        System.out.println("Multiply: " + a.multiply());
        System.out.println("Divide: " + a.divide());
        System.out.println("Min: " + a.getMin());
        System.out.println("Max: " + a.getMax());
    }
    public static int getUserChoice() {
        System.out.println("1 (int) | 2 (long) | 3 (float) | 4 (double)");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
    public static Number getUserInput(int choice, int num) {
        switch (choice) {
            case 1:
                System.out.print("Enter int num" + num + ": ");
                return sc.nextInt();
            case 2:
                System.out.print("Enter long num" + num + ": ");
                return sc.nextLong();
            case 3:
                System.out.print("Enter float num" + num + ": ");
                return sc.nextFloat();
            case 4:
                System.out.print("Enter double num" + num + ": ");
                return sc.nextDouble();
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}
