//QUESTION:
//Printing Table according to input:

//SOLUTION:

import java.util.Scanner;
public class Loop5_Table_Print {
    public static void main(String[] args) {

        //build the Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the N you want the table:");

        //use the scanner
        int N = sc.nextInt();
        System.out.println("Here your table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }

    }
}
