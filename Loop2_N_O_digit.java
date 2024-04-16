
//counting Given digits:

import java.util.Scanner;

public class Loop2_N_O_digit {
    public static void main(String[] args){

        //Build the Scanner:
        Scanner sc =  new Scanner(System.in);

        //Input:To count the number of the digit:
         System.out.println("Enter a NUMBER 'I can count the no of digits': ");
        int N = sc.nextInt();
        int digits = 0;

        if (N==0){
            System.out.println(1);
        }
        else {

            while(N != 0){
              digits = digits+1;
              N = N/10;
            }
            System.out.println("no of digits entered by you: "+ "\n"+ digits);
        }





    }
}
