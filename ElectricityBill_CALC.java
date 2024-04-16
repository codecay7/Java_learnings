//PROBLEM:
/*Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:

        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill.*/

//Solution

import java.util.Scanner;
public class ElectricityBill_CALC {
    public static void main(String[] args) {

        //for the input build the scanner first
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter Units: ");
        int Units=sc.nextInt();
        float ans;


      //Calculating Bill by Calculating using else-if statements:

      if(Units <= 50) {
          ans = Units * 0.50f ;                                                            //For first 50 units Rs. 0.50/unit
      }

      else if (Units <= 150) {
          ans = (0.50f * 50) + (Units - 50) *  0.75f;                                      //For next 100 units Rs. 0.75/unit
      }

      else if (Units <= 250) {
          ans = (0.50f * 50) + (0.75f * 100) +  (Units - 150) * 1.20f    ;                     //For next 100 units Rs. 1.20/unit
      }

     else{
          ans = (0.50f * 50) + (0.75f * 100) + (1.20f * 100) + (Units-250) * 1.50f ;             //For unit above 250 Rs. 1.50/unit
      }


          int bill =(int)(1.20 * ans);

         System.out.println("YOUR TOTAL BILL: ₹" +bill);



    }


}
