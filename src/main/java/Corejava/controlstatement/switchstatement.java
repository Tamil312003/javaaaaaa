package Corejava.controlstatement;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("find your classmates birthday month");
        String month = ss.next();
        switch (month) {
            case "januvary":
                System.out.println("A's birthday month");
                break;
            case "feb":
                System.out.println("B's birthday month");
                break;
            case "march":
                System.out.println("C's birthday month");
                break;
            case "apirl":
                System.out.println("D's birhtday month ");
                break;
            case "may":
                System.out.println("E's birthday month");
                break;

        }


    }

}




