package homework_week_8;

/**   9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 *
 */
public class Programme9FibonacciNumber {

    public static void main(String[] args) {
        int n = 8 ,firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till"  +  n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm + " , ");

            //compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = firstTerm;


        }

    }




}
