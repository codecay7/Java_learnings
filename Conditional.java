import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){

       //for the input build the scanner first
        Scanner sc = new Scanner(System.in);

       //input
        int temperature= sc.nextInt();

       //conditional Statements
        if(temperature>25){
            System.out.println("STOP! Hot Day Today");
        }
        else{
            System.out.println("Let's Go! Looks Good");
        }

    }
}
