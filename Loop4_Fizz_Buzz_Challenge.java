
//Question:

//FIZZ BUZZ challenge!

//multiple of 3 print FIZZ
//multiple of 3 print BIZZ
//multiple of 3 && 5 print FIZZ BIZZ

//SOLUTION:

import java.util.Scanner;

public class Loop4_Fizz_Buzz_Challenge {
    public static void main(String[] args) {
        //build the Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the N");
        //use the scanner
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            if (i % 3 == 0 && i % 5 == 0) {       // order of conditions are also important
                System.out.println("FIZZ BUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }

        }


//         //        build the scanner
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter num ");
//         // using the scanner
//       int n=0;
//        int i=0;
//          while (i<=100){
//
//              if (n%3==0 && n%5==0){
//                  System.out.println("FIZZ BUZZ");
//              }
//              else if(n%5==0){
//                  System.out.println("BUZZ");
//              }
//              else if(n%3==0){
//                  System.out.println("FIZZ");
//              }
//              else {
//                  System.out.println(i);
//              }
//
//               i++;
//
//          }


    }
}
