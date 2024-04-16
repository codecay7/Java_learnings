package college_JAVA;

import java.util.Scanner;

public class QUESTION_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = calculateExpression(x, n);

        System.out.println("S = " + result);
    }

    public static int calculateExpression(int x, int n) {
        int sum = x;

        for (int i = 2; i <= n; i++) {
            
            sum += Math.pow(x, i);
        }

        return sum;
    }
}
