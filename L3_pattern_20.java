import java.util.Scanner;

public class L3_pattern_20 {
    public static void main(String[] args){

        Scanner Myscanner=  new Scanner(System.in) ;
        int n=Myscanner.nextInt();

//printing i ,column will not change
//1111
//2222
//3333
//4444
     for (int i=1;i<=n;i++){      //row
         for (int j=1;j<=n;j++){  //column
             System.out.print(i);
         }
         System.out.println();
     }

//printing j ,row will not change

//        for (int i=1;i<=n;i++){    //row
//            for (int j=1;j<=n;j++){ //column
//                System.out.print(j);   // printing j
//            }
//            System.out.println();   //change the row to new line
//        }


         //printing this:
                //54321
                //54321
                //54321
                //54321
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print(n-j+1);  //prints 54321  5 times when its <= 5
//            }
//            System.out.println();
//        }


    }
}
