package Corejava.arraycrudal;

import java.util.Arrays;
import java.util.Scanner;

public class updateArray {
    public static void main(String[] args) {
        String [] Friends= {"sam","Annamalai","vicky","Dhanushaya"};
        System.out.println("Before Updating Values");
        System.out.println(Arrays.toString(Friends));

        Scanner scan=new Scanner(System.in);

        System.out.println("Tell us what is position to update");
        int pos=scan.nextInt();
        System.out.println("What is update/replace value");
        String name=scan.next();
        Friends[pos]=name;

        System.out.println("After updating Values");
        System.out.println(Arrays.toString(Friends));

    }

}
