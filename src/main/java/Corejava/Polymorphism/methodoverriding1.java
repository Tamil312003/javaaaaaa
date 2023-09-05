package Corejava.Polymorphism;

public class methodoverriding1 {
    public void number(int a, int b) {
        if(a==b||a<=b){
            System.out.println("the statement is true ");
        }
        else {
            System.out.println("the statement is false");
        }
    }


    public static void main(String[] args) {
        methodoverriding1 mm=new methodoverriding1();
        mm.number(24,15);
        methodoverriding nn=new methodoverriding();
        mm.number(15,20);
    }

    }
