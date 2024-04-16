import java.util.Scanner;
public class Add2Num_L10_Taking_Input {
        public static void main(String[] args) {
            //building the scanner:
            Scanner sc= new Scanner(System.in);

            //taking input
            Scanner MyScanner = new Scanner(System.in);

            int a= MyScanner.nextInt();
            int b= MyScanner.nextInt();

             int c=a+b;

            System.out.println(c);
        }
}
