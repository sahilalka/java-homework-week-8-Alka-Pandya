package homework_week_8;

import java.util.Scanner;

/**  8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
public class Programme8Angle {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Enter Right Angled Triangle Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Angled Triangle Star Pattern");

        for (int i = 1 ; i <= rows; i++ )
        {
            for (int j = 1 ; j <= i; j++ )
            {
                System.out.print("@");
            }
            System.out.println();

        }
    }











    }











