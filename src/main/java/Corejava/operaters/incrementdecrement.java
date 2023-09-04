package Corejava.operaters;

public class incrementdecrement {
    public static void main(String[] args) {
        int a=10;
        int b=290;
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(b++);
        System.out.println(b--);

        int A=10;
        A=A++ + ++A;    // postdecrement and predecerment
        System.out.println(A);

        int C=12;
        int B=6;
        int G;
        G =C++ + ++B - B-- + ++C;
        System.out.println(G);


    }
}
