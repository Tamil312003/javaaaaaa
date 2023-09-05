package Corejava.Polymorphism;

public class methodoverriding {
    public void number(int a, int b) {
        if (a == b && a > b) {
            System.out.println("a is greater than b");
        } else if (a < b || a != b)
            System.out.println("the statement is true");
        else if (a <= b || a != b) {
            System.out.println("statement is false");
        } else {
            System.out.println("number is invalid ");
        }
    }
}



