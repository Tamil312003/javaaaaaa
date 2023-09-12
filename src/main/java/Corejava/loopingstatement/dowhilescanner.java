package Corejava.loopingstatement;

import java.util.Scanner;

public class dowhilescanner {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        // int mark1=2;
        int mark1=5;
        do {
            System.out.println("Enter your biology mark ");
           int mark = ss.nextInt();
            mark++;

            if (mark >= 80) {
                System.out.println("you are eligible for NEET");
                mark++;
            } else {
                System.out.println("mark is invalid");
            }

        }
        while (mark1 < 0);


    }
}

































