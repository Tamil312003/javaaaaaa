package Corejava.controlstatement;

import java.util.Scanner;

public class nestedifstatement {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("please enter your 12th cut off mark");
        int cutoff = ss.nextInt();
        if (cutoff >= 185) {
            System.out.println("you are selected for engineering group");
            System.out.println("enter your biology mark and maths mark");
            int biologymark = ss.nextInt();
            int mathsmark = ss.nextInt();
            if ((biologymark >= 95) || (mathsmark > 97)) {
                System.out.println("you are selected for higher studies");
            } else {
                System.out.println("you are not selected for higher studies");
            }
            if ((biologymark > 95) && (mathsmark > 97)) {
                System.out.println("you are selected for medical field ");
            } else {
                System.out.println("you are not eligible for medical field");
            }
        }

        else
          {
            System.out.println("you are not eligible");
          }
    }

}



