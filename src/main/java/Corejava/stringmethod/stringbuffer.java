package Corejava.stringmethod;

public class stringbuffer{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("vignesh");// original
        //Append
        String name="tamil";
        s.append("kumar");// append string
        System.out.println(s);
        //insert
        s.insert(9,"sam");
        System.out.println(s);
        //replace
        s.replace(1,3,"tamil");
        System.out.println(s);
        s.delete(1, 2);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        StringBuffer ss=new StringBuffer("tamilaelvan");
        ss.replace(5,6,"s");
        System.out.println(ss);
        ss.append("PK");
        System.out.println(ss);

    }
}
