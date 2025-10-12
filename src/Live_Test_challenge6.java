import java.util.Scanner;

public class Live_Test_challenge6 {
    public static void main(String[] args) {/*
        Number Classification
        Write a program to check if a number is positive, negative, or zero.

                **Requirements:**
        - Read an integer from user input
                - Use if-else statements to classify the number
                - Print appropriate message for each case*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        if(!scanner.hasNextInt()){
            System.out.println("You Fool, int only!");
        }else {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number + " is Positive");
            } else if (number < 0) {
                System.out.println(number + " is Negative");
            } else {
                System.out.println(number + " is Zero");
            }
        }
    }
}
