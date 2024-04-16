
//implementation of  Interface
package Exam;
import java.util.Scanner;


interface Client {
    void input();

    void output();
}

class Developer implements Client {
    String name;
    double Salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        name = sc.nextLine();

        System.out.println("enter Salary: ");
        Salary = sc.nextDouble();

        System.out.println("you entered successfully");

    }

    public void output() {
        System.out.println("here is your entered name & salary:\n " + name + "\n " + Salary);
    }

}

public class Interface {
    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();
    }
}
