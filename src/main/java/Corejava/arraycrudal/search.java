package Corejava.arraycrudal;

import java.util.Arrays;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        String []name=new String[3];
        name[1]="tamil";
        name[0]="selvan";
        name[2]="pk";
        System.out.println(Arrays.toString(name));
        Scanner ss=new Scanner(System.in);
        for(int a=0;a<name.length;a++){
            System.out.println("enter the name");
            String name1=ss.next();
            if(name1.equalsIgnoreCase(name[a])){
                System.out.println("valid");
            }
            else {
                System.out.println("invalid");
            }
        }







    }
}
