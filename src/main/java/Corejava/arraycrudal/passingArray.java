package Corejava.arraycrudal;

import java.util.Arrays;

public class passingArray {
    public  void PassingArray(float[]salary)
    {
        salary[3] =  1111.12f;
        salary[0] = 1122.15f;
        System.out.println(Arrays.toString(salary));
    }
    public void PassingArray2(String name)
    {
        System.out.println("Welcome");
    }
    public static  void main(String[] args) {
        int a = 100;
        String name = "Annamalai";
        float[] A = {11.3f, 12.4f, 4, 85.5f, 78, 63.4f};
         passingArray mm=new passingArray();
         mm.PassingArray(A);
         mm.PassingArray2(name);
        System.out.println(name);
        System.out.println(a);
    }
}
