package Corejava.stringmethod;

public class string2 {
    public static void main(String[] args) {
        String a="Annamalai";
        System.out.println(a);
        String a1="annamalai";//literal
        System.out.println(a1);
        String a2=new String("Annamalai");// non literal
        String a3="kumar";
        System.out.println(a.equals(a1));
        System.out.println(a2.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a==a1);
        System.out.println(a.compareTo(a2));

    }
}
