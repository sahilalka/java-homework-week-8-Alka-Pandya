package homework_week_8;

/**   13. Shared Digit
 Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.
 *
 */
public class Programme13SharedDigit {
       public static boolean hasSharedDigit(int a,int b){
           int modulesOne = a % 10;
           int modulesTwo = b % 10;
           int divisionOne = a / 10;
           int divisionTwo = b / 10;


           if ((a < 10 || a > 99) ||  ( b < 10 || b > 99)){
               return false;
           } else if (a == b) {
               return true;

           } else if (modulesOne == modulesTwo) {
               return true;

           } else if (divisionOne == divisionTwo) {
               return true;

           } else if (divisionOne == modulesTwo) {
               return true;

           } else if (divisionTwo == modulesOne) {
               return true;

           } else  {
               return false;

           }


       }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }


}
