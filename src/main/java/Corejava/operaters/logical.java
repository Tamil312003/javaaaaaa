package Corejava.operaters;

public class logical {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=40;
        System.out.println(a<b&&a>c);
        System.out.println(a<c||c>a);
        System.out.println(a==b && a<=c);
        System.out.println(a==b);
        System.out.println((a!=b));
        System.out.println(!(c==b));
        System.out.println(!(a==b)||(a!=b));
    }
}


