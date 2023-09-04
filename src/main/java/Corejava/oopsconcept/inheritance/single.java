package Corejava.oopsconcept.inheritance;
class tamil
{
    public void selvan()
    {
        System.out.println("tamil is the good boy");
        String name="periyaponnu";
        System.out.println(name);
    }
}
class kumar extends tamil
{
    public void periyaponnu()
    {
        System.out.println("mother");
        String name1="kumar";
        System.out.println(name1);
    }
}

public class single {
    public static void main(String[] args) {
        int A = 23;
        System.out.println(A);
        kumar n = new kumar();
        n.selvan();
        n.periyaponnu();
    }
}
