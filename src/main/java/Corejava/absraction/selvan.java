package Corejava.absraction;

public class selvan extends abstraction {
    @Override
    public void ArithemeticOperator(int a, int b) {
        System.out.println(a==b&&a<b);
        System.out.println(a>b||b!=a);

    }

    @Override
    public void additional(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);

    }


    public static void main(String[] args) {
        selvan nn=new selvan();
        nn.additional(20,10);
        nn.ArithemeticOperator(20,13);

    }

    }
