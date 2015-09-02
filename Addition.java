// Addition.java

// Operators = +, -, *, /, $ (modulus) = remainder
// 4%3 = 1 / 994%3 = 0
// If we do 6/4 = 1 / we should do (double) 6/4 = 1.5
// C++
// x++ = -> x = x + 1 (Increment)
// x-- = -> x = x - 1 (Decrement)

import java.util.Scanner; // enable user input

public class Addition {
 
  public static void main( String[] args ) {
    
    Scanner input = new Scanner( System.in );
    
    int num1; // 1st num
    int num2; // 2nd num
    int sum; // total sum
    
    System.out.println( "Enter the first number: " );
    num1 = input .nextInt();
    // System.out.println( num1 );
     System.out.println( "Enter the second number: " );
    num2 = input .nextInt();
    
    sum = num1 + num2;
    
    System.out.println( "The sum is " + sum );
    
  } // end main method
} // end class