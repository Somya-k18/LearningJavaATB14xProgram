import java.util.Scanner;

public class Live_Test_challenge11 {
    public static void main(String[] args) {
   /*     Print Numbers Using For Loop
        Write a program to print numbers from 1 to N using a for loop.

                **Requirements:**
        - Read the value of N from user input
        - Use for loop to print numbers from 1 to N
        - Print numbers in a single line separated by spaces*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        if(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >0) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
            }
            else{
                System.out.println("Number should be greater than zero!!");
            }
        }else{
            System.out.println("Enter integer only");
        }
    }
}
