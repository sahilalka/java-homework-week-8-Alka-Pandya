package homework_week_8;

import java.util.Scanner;

/**  10. Write a program to input any number and check if it Armstrong number or not
 153 = (1*1*1)+(5*5*5)+(3*3*3)
 where:
 (1*1*1)=1
 (5*5*5)=125
 (3*3*3)=27
 So:
 1+125+27=153
 *
 */
public class Programme10ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();
        int temp = n;
        int res =0;
        while (temp>0){
            int Id = temp%10;
            res = res + Id*Id*Id;
            temp = temp/10;
        }
        if(res == n){
            System.out.println("number is armstrong");
        }
         else {
        }
        System.out.println("number is not armstrong");
         scanner.close();
    }


}
