package CodingNINJA;

import java.util.Scanner;

public class L2_pattern_19 {
    public static void main (String[] args){
        //use the scanner
     Scanner MyScanner= new Scanner(System.in);
     //taking input as N
     System.out.println("enter number for row and column you want to print");
     int N =MyScanner.nextInt() ;

   for (int i=0;i<N;i++){           //prints every row
       for (int j=0; j<N;j++) {     //prints every column
           System.out.print("*");    //prints * continuously
       }
       System.out.println(); //change the line after printing each row
   }

    }
}
