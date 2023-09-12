package Corejava.scannerclass;
import javax.sound.sampled.Line;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = ss.next();
        System.out.println("My name is" + name);
        System.out.println("what is your age");
        int age = ss.nextInt();
        System.out.println("i am" + age);
        System.out.println("where are you from ");
        String place = ss.next();
        System.out.println("i am from" + place);
        System.out.println("yours father name");
        String A = ss.next();
        System.out.println("my father name is" + A);
        System.out.println("yours mother name");
        String B = ss.next();
        System.out.println("my mother name is" + B);
        System.out.println("your phone number");
        long C =ss.nextLong();
        System.out.println("yours 10th mark percentage");
        float D = ss.nextFloat();
        System.out.println("my 10th mark percentage is" + D);
        System.out.println("your grade in last semester");
        double E = ss.nextDouble();
        System.out.println("my grade in last semester is" + E);




























    }
}
