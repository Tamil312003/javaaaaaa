package Corejava.controlstatement;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter the vowels");
        String A=ss.next();
        switch (A) {
            case "a":
                System.out.println("A\nE\nI\nO\nU\nS");
                break;

        }

    }
}
