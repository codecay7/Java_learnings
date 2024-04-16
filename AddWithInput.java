import java.util.Scanner;

public class AddWithInput {
        public static void main(String[] args) {

          //Input
            Scanner sc= new Scanner(System.in);//Here "NEW" Allocates Memory.

           //use the scanner
            String name= sc.nextLine();
             String college= sc.nextLine();
             int age = sc.nextInt();


            System.out.println("Hello " + name);
            System.out.println("YOUR COLLEGE IS:" + college);
            System.out.println("YOUR AGE IS:"+ age);
        }
    }

