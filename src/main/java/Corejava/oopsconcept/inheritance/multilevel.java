package Corejava.oopsconcept.inheritance;
class W{
    public void tamil()
    {
        System.out.println("metallurgy");
        String name="degree";
        System.out.println(name);
    }
}
class B extends W
{
    public void selvan()
    {
        System.out.println("computer science");
        String name1="degree1";
        System.out.println(name1);
    }
}
class C extends B
{
    public void periyaponnu()
    {
        System.out.println("home maker");
        String name2="no degree";
        System.out.println(name2);
    }
}

public class multilevel {
    public static void main(String[] args) {
        C n =new C();
        n.tamil();
        n.selvan();
        n.periyaponnu();
    }
}
