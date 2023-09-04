package Corejava.variables;

public class variables {

    String salem ="mangocity";  //global variables
    static String mettur ="Dam";    //static variables
    public void hii()
    {
        String name ="tamil";     // local variables
        System.out.println(salem);
        System.out.println(mettur);
        System.out.println(name);
    }
    public static void main(String[] args) {
        int data=678;     //Instance variables
        int data1=567;
        System.out.println(data);
        System.out.println(data1);
        System.out.println(mettur);
        variables n=new variables();      //classname objectname=new classname()
        n.hii();                          //objectname.methodname()



    }

}
