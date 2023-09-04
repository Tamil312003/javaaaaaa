package Corejava.loopingstatement;

import java.util.Scanner;

public class dowhilescanner {
    public static void main(String[] args) {

        int standard=12;
        do {
            Scanner ss = new Scanner(System.in);
            System.out.println("Enter your number ");
            int mark = ss.nextInt();

                if (mark >= 20 && mark <= 90)
                {
                    System.out.println("you are are selected");
                    mark++;
                }
                else
                {
                    System.out.println("mark is invalid");
                }
            }
            while (standard>10) ;
            {
                System.out.println("invalid");
            }
        }
    }























