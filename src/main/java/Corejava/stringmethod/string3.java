package Corejava.stringmethod;

public class string3 {
    public static void main(String[] args) {
        String a="vignesh";
        System.out.println(a.startsWith("v"));
        System.out.println(a.endsWith("i"));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(3));
        System.out.println(a.length());
        String s="Nothing more than happiness.happy the faces";
        s.replace("happy","feel");
        System.out.println(s);
        String s1="Yusuf Loves Swetha";
        String s2=s1.replace("Yusuf","Teja");
        System.out.println(s2);

    }
}
