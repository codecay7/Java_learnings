package Exam;

/* MULTIPLE INHERITANCE Using Interfaces*/

interface A {
   void Show();  //public+abstract always
}
interface B {
  void Disp();  //public+abstract always
}

class Multiple_Inheritance implements A, B {
    public void Show() {
        System.out.println("interface A is running");
    }

    public void Disp() {
        System.out.println("interface B is running");
    }

    public static void main(String[] args) {
        Multiple_Inheritance ob = new Multiple_Inheritance();
        ob.Show();
        ob.Disp();

    }

}

/* Define two interfaces: Animal and Bird


interface Animal {
    void eat(); // abstract method
    void sleep(); // abstract method
}

interface Bird {
    void fly(); // abstract method
    void sing(); // abstract method
}

// Define a class: Penguin that implements both interfaces
class Penguin implements Animal, Bird {
    // Implement the methods from both interfaces
    public void eat() {
        System.out.println("Penguin eats fish.");
    }

    public void sleep() {
        System.out.println("Penguin sleeps on ice.");
    }

    public void fly() {
        System.out.println("Penguin cannot fly.");
    }

    public void sing() {
        System.out.println("Penguin makes honking sounds.");
    }
}

// Define a class: Test to create an object of Penguin and call its methods
public class Test {
    public static void main(String[] args) {
        Penguin p = new Penguin(); // create a Penguin object
        p.eat(); // call the eat method
        p.sleep(); // call the sleep method
        p.fly(); // call the fly method
        p.sing(); // call the sing method
    }
}
*/