package Corejava.modifier.protector;

public class protect1 {
    public void hii() {
        String name = "selvan";
        System.out.println(name);
    }


    public static void main(String[] args) {
        protect1 mm = new protect1();
        mm.hii();
    }
}
