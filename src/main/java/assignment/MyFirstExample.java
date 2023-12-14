package assignment;

import java.util.Scanner;

public class MyFirstExample {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String name="";
        int age=0;
        int currentYear=2023;

        //give the user three chances to enter a valid name
        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter your name: ");
            name=scanner.nextLine();

            //validate that the name is not empty
            if(!name.trim().isEmpty()){
                break;
            }else {
                System.out.println("Name cannot be empty!");
            }
        }

        //after three attempts
        if(name.trim().isEmpty()){
            System.err.println("system locked! too many unsuccessfull attempts!");
            System.exit(0);
        }


        // Give the user three chances to enter a valid age
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your age between 1 - 130 : ");
            age = scanner.nextInt();

            // Validate that the age is within the specified range
            if (age >= 1 && age <= 130) {
                break;
            } else {
                System.out.println("Invalid age. Please enter a value between 1 and 130.");
            }
        }

        // If after three attempts the age is still invalid, display a warning and exit
        if (age < 1 || age > 130) {
            System.out.println("System locked! Too many unsuccessful attempts.");
            System.exit(0);
        }



        // Calculate the year of birth
        int birthYear = currentYear - age;

        // Display the result
        System.out.println("Hello, " + name + "! Your birth year is: " + birthYear);

        // Close the scanner to prevent resource leak
        scanner.close();








    }
}


