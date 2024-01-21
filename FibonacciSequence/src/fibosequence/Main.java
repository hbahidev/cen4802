package fibosequence;

/**
 * Fibonacci Sequence Class
 * 
 * @author Bahi Hamdi
 */
public class Main {

/**
 * Create a recursive method to calculate the nth term of the Fibonacci sequence
 * @param n represent The position of the term in the Fibonacci sequence.
 * @return returns The nth term in the Fibonacci sequence.
 */
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/**
 *  main method that calls the fibonacci method. 
 * @param args
 */
public static void main(String[] args) {       
        
		// Pass in 10 as an argument
		int n=10;
		
		// Call the Fibonacci method to get the nth term
		int nthTerm = fibonacci(n);
		
		// Display  The nth term of the Fibonacci sequence 
        System.out.println("The " + n + "the term of the Fibonacci Sequence is: " + nthTerm + ".");
    }
}
