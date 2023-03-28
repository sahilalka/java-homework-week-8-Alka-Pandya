package homework_week_8;

import java.util.Scanner;

/**1. Read 10 numbers from the console entered by the user and print the sum of those
   numbers.
*   -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 *  -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
    10 numbers.
 *  -Use the nextInt() method to get the number and add it to the sum.
 *  -Before the user enters each number, print the message Enter number #x: where x represents the
   count, i.e. 1, 2, 3, 4, etc.
 *  -For example, the first message printed to the user would  Enter number #1:, the next Enter number
 *  #2:, and so on.
 */

public class Programme1ReadingUserInputChallenge {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console.
        Scanner scanner = new Scanner(System.in);

         //variable declaration
        int count = 1;
        int sum = 0;
        // using a while loop

        while (count<=10);
        System.out.println("Enter number #"  + count + "");

        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            sum += number;
            count++;

        }else {
            System.out.println("Invalid Number");
            scanner.next();//discard the input

        }

        System.out.println("The sum of the 10 number is : "  +  sum);
        scanner.close();//closing scanner object


    }



}
