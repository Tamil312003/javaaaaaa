package Corejava.Encapsulation;
class details
{
    public int rollno;
    public String name;
    public String Dept;
    public  int phn;
    public String Cname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }
}

public class Collegedetails {
    public static void main(String[] args) {
        details dd = new details();
        dd.setRollno(1234);
        dd.setName("Tamil");
        dd.setDept("Mett");
        dd.setPhn(12456789);
        dd.setCname("GCE");
        System.out.println(dd.getRollno()+"\n"+dd.getName()+"\n"+dd.getDept()+"\n"+dd.getPhn()+"\n"+dd.getCname());
    }
}
