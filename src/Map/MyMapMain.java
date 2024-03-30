package Map;

import java.util.Scanner;

public class MyMapMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMap<Integer, String> myMap = new MyMap<>();

        char choice;

        System.out.println("Choose an action:");
        System.out.println("a - Add a key-value pair");
        System.out.println("g - Get value for a key");
        System.out.println("r - Remove key-value pair");
        System.out.println("x - Exit program");

        while (true) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.print("Enter the key (Integer): ");
                    int key = scanner.nextInt();
                    System.out.print("Enter the value (String): ");
                    String value = scanner.next();
                    myMap.put(key, value);
                    System.out.println("Key-value pair added successfully!");
                    break;
                case 'g':
                    System.out.print("Enter the key to retrieve value (Integer): ");
                    int getKey = scanner.nextInt();
                    String getValue = myMap.get(getKey);
                    if (getValue == null) {
                        System.out.println("No value found for the specified key.");
                    } else {
                        System.out.println("Value for key " + getKey + ": " + getValue);
                    }
                    break;
                case 'r':
                    System.out.print("Enter the key to remove (Integer): ");
                    int removeKey = scanner.nextInt();
                    String removedValue = myMap.remove(removeKey);
                    if (removedValue == null) {
                        System.out.println("No key-value pair found for the specified key.");
                    } else {
                        System.out.println("Key-value pair removed successfully! Removed value: " + removedValue);
                    }
                    break;
                case 'x':
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}