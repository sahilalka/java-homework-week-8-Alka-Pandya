package homework_week_8;
/** Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 The method needs to find the first and the last digit of the parameter number passed to the method,
 using a loop and return the sum of the first and the last digit of that number.
 If the number is negative then the method needs to return -1 to indicate an invalid value.
 *
 *
 */

import java.util.Scanner;

public class Programme7FirstAndLastDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner declaration for reading input from console

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumFirstAndLastDigit(number);
        System.out.println("sum of first and last digits: " + sum);
        scanner.close();//closing scanner object
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number >= 10){
            number /= 10;
            firstDigit = number;
        }
        return firstDigit + lastDigit;
    }




}
