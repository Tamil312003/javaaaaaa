package Corejava.controlstatement;

import java.util.Scanner;

public class elseifstatement
{
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Hillstation in india ");
        String Hill = ss.nextLine();
        String Hill1 = ss.nextLine();

        if (Hill.equalsIgnoreCase("kolli hills"))
        {
            System.out.println("hairpin bents");
        } else if (Hill.equalsIgnoreCase("ooty"))
        {
            System.out.println("cooling spot");
        } else if (Hill1.equalsIgnoreCase("kodaikanal"))
        {
            System.out.println("cooling area");
        }
           else if ((Hill.equalsIgnoreCase("kashmir"))&&(Hill1.equalsIgnoreCase("yercard")))
        {
            System.out.println("favourite place");
        }
        else
        {
            System.out.println("you stay at home");
        }
    }
}