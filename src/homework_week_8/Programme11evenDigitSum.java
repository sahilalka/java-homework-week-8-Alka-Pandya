package homework_week_8;

/**  11. Even Digit Sum
 Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class Programme11evenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
       public static int getEvenDigitSum(int number) {
           int originalNumber = number;
           int lastDigit;
           int sumOfEvenDigit = 0;
           if (number > 0) {
               while (number > 0) {
                   lastDigit = number % 10;
                   if (lastDigit % 2 == 0) {
                       sumOfEvenDigit += lastDigit;

                   }
                   number /= 10;


               }
               if (originalNumber >= 0) ;
               System.out.println("The sum of even digits within a number " + originalNumber + " is equal to:");

           }      return sumOfEvenDigit;





       }              }