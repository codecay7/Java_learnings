import java.util.Scanner;

public class Largest_NUM {
    public static void main(String[] args) {

        //for the input build the scanner first
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();


        // comparing between numbers:
        if(a>b){
            System.out.println("'A' is greater that is: " + a);
        }

        else if (b>a) {
            System.out.println("'B' is greater that is: " + b);
        }

        else {
            System.out.println("Both given NUMBERS are equal");

        }

    }
}

