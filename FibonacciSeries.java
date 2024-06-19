package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n = 8, a = 0, b = 1;
	    System.out.println("Fibonacci Series of " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.println(a);

	      // compute the next term
	      int sum = a + b;
	      a = b;
	      b = sum;
	    }
	  }
			
	}
