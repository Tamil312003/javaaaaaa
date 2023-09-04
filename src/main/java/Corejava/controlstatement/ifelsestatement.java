package Corejava.controlstatement;


import java.util.Scanner;

public class ifelsestatement {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=ss.next();
        if(name.equalsIgnoreCase("tamilselvan"))
        {
            System.out.println("your name is selected");
        }
        else
        {
            System.out.println("you are not eligible");
        }
    }
}
