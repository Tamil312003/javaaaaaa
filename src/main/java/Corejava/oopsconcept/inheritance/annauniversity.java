package Corejava.oopsconcept.inheritance;

public class annauniversity extends GCE implements Mett, CSE, EEE {
    public void colleges() {
        System.out.println("top colleges in tamil nadu");
    }

    @Override
    public void Hari() {
        System.out.println("good boy");
        System.out.println("hwloo");
    }

    @Override
    public void Priya() {
        System.out.println("bad girl");

    }

    @Override
    public void Tamil() {
        System.out.println("very good boy");

    }


    public static void main(String[] args) {
        annauniversity ss = new annauniversity();
        ss.colleges();
        ss.Hari();
        ss.Priya();
        ss.Tamil();
        ss.friends();
    }
    }


