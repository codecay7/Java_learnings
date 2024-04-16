package KUNAL_DSA;
import java.util.Scanner;
public class Switch_Case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Fruit = in.next(); //taking input string

        switch (Fruit) {
            case "Apple":
                System.out.println("Apple is collected");
                break;

            case "Mango":
                System.out.println("fruits ka Raja AAM");
                break;

            default:
                System.out.println("choose right fruit among these: Apple ,Mango:");


        }
    }
}
