package Corejava.Polymorphism;

public class MethodOverloading {

    public void Calculate(String name1, String name2)
    {
        if (name1 == name2) {
            System.out.println("Your value is equal");
        }
        else
        {
            System.out.println("Your value is not equal");
        }
    }

    public int Calculate(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;

    }

    public void  Calculate(Float ab, Float ba) {
        double abc = ab + ba;//widening perforamnce
        System.out.println("my float value is abc = " + abc);

    }

    public static void main(String[] args)
    {
        MethodOverloading over = new MethodOverloading();
        over.Calculate(12, 12);
        over.Calculate(4.5f, 4.3f);
        over.Calculate("annamalai", "annamalai");

    }
}
