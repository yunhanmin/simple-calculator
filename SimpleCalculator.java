// SimpleCalculator.java
// Today's Assignment

import java.util.Scanner;

public class SimpleCalculator {
  
  public static void main( String[] args ) {
    
    Scanner input = new Scanner( System.in );
    
    double num1;    // 1st num
    double num2;    // 2nd num
    int choice;  // which poerator will you use?
    double total;   // total sum
    
    System.out.println( "Enter the first number: " );
    num1 = input .nextInt();
    // System.out.println( num1 );
     System.out.println( "Enter the second number: " );
    num2 = input .nextInt();
    
    System.out.println( "Choose an operator: 1(+), 2(-), 3(*), 4(/), 5(%)" );
    choice = input .nextInt();
    System.out.println( choice );
    
    // Control Structures
    if( choice == 1 ) {
     total = num1 + num2; 
    } else if( choice == 2 ) {
     total = num1 - num2;
    } else if ( choice == 3 ) {
     total = num1 * num2; 
    } else if ( choice == 4 ) {
     total = num1 / num2;
    } else if ( choice == 5) {
      total = num1 % num2;
    } else {
      total = 0;
      System.out.println( "ERROR. WRONG INPUT." );
    }
    
    System.out.println( "The total is " + total );
    
  } // end main method
} // end class