package Corejava.absraction;

public class tamil extends abstraction {
    @Override
    public void ArithemeticOperator(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
        int c = a % b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        tamil mm = new tamil();
        mm.additional(20, 17);
        mm.ArithemeticOperator(3, 6);
    }
}
