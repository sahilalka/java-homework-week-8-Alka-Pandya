package homework_week_8;

import java.util.Scanner;

/**2. -Read the numbers from the console entered by the user and print the minimum
 and maximum number the user has entered.
 -Before the user enters the number, print the message Enter number:
 -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 number.
 */
public class Programme2MinAndMaxChallenge {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
         //using while loop
        while (true) {
            System.out.println("Enter number");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;

                }
                if (number > max) {
                    max = number;

                } else {
                    break;
                }
                scanner.nextLine();// discard the input

            }

            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
            scanner.close(); // scanner closing

        }


    }

}