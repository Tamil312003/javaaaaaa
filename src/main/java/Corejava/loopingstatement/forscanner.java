package Corejava.loopingstatement;

import java.util.Scanner;

public class forscanner
{
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);

        for (int myrequirementplace = 10; myrequirementplace > 0; myrequirementplace--)
        {
            System.out.println("what is your Experience");
            float experience = ss.nextFloat();
            if (experience >= 4 && experience <= 8)
            {
                System.out.println("your Selected in this process no :" + myrequirementplace);

            }
            else
            {
                System.out.println("your not selected in this company");
            }
        }

    }


}






