package Corejava.arraycrudal;
import java.util.Arrays;
import java.util.Scanner;
public class searchArray {
    public static void main(String[] args) {
        String [] Actress= {"Samantha","Trisha","Rashmika","Rashikanna","Gowthamipriya","priya","Anjali  "};
        System.out.println(Arrays.toString(Actress));
        Scanner scan=new Scanner(System.in);
        System.out.println(Actress.length);
        for(String A:Actress){
            System.out.println(A);
        }
        for(int pos=0;pos<Actress.length;pos++)
        {
            System.out.println("Tell us What is Your favorite actor");
            String favor=scan.next();
            if(favor.equalsIgnoreCase(Actress[pos]))
            {
                System.out.println(favor+" Actress is founded");
            }
            else{
            	System.out.println(favor+" actress is not founded");
            }
        }

    }
}
