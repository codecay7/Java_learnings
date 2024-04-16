package college_JAVA;

import java.util.Scanner;

public class Largestamongnumber {
    public static void main(String[] args) {

        //scanner build
        Scanner scanner = new Scanner(System.in);

        //taking input
        System.out.println("enter x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Processing ob = new Processing(x, y);

        if (x > y) {
            System.out.println("X is greater");
        } else {
            System.out.println("Y is greater");
        }
    }
}
class Processing {
    int x;
    int y;

    public Processing(int x, int y) {

    }
}
