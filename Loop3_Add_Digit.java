
//Sum of the digits given by user:

import java.util.Scanner;
public class Loop3_Add_Digit {
    public static void main(String[] args) {
        //Build the Scanner:
        Scanner sc = new Scanner(System.in);

   System.out.println("enter digits to do the sum of all digit");

    int N=sc.nextInt();
    int Sum=0;

        while(N!=0)
        {
         Sum= Sum + N%10;
         N=N/10;
        }
         System.out.println(Sum);
    }
}
