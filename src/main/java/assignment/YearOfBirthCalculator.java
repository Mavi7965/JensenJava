package assignment;

import java.util.Scanner;

public class YearOfBirthCalculator {
        /*
    Static Modifier:

If you remove static, you would need to create an instance of the YearOfBirthCalculator class to call these methods.
 This means you need to instantiate the class using new YearOfBirthCalculator() before calling these methods.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get a valid name
            System.out.println("Enter your name, please:");
            String name = scanner.nextLine();

            // Get a valid age
            int age = getValidAge(scanner);

            YearOfBirthCalculator yearOfBirthCalculator = new YearOfBirthCalculator();
            System.out.println(yearOfBirthCalculator.calculateBirthYear(name, age));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    // Method to get a valid age
    public static int getValidAge(Scanner scanner) {
        int age;
        while (true) {
            try {
                System.out.println("Enter your age :");
                age = scanner.nextInt();
                if (isValidAge(age)) {
                    return age;
                } else {
                    throw new IllegalArgumentException("Invalid age. Please enter a value between 1 and 130.");
                }
            } catch (Exception e) {
                scanner.nextLine(); // Consume the invalid input
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    // Method to validate age
    public static boolean isValidAge(int age) {
        return (age >= 1) && (age <= 130);
    }


    // Method to validate name
    public void isValidName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty. Enter a valid name.");
        }
    }


    // Method to calculate the birth year
    public String calculateBirthYear(String name, int age) {
        int currentYear = java.time.LocalDate.now().getYear();
        int birthYear = currentYear - age;

        String result = "Hello " + name + "! You were born in " + birthYear;

        isValidName(name); // Throws an exception if the name is invalid

        return result;
    }


}