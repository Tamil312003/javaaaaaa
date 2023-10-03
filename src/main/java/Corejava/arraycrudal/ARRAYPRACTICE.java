package Corejava.arraycrudal;
import java.util.Arrays;
import java.util.Scanner;
public class ARRAYPRACTICE {
    public void passingarray(int[]A){
        A[2]=23;
        A[4]=67;
        A[1]=90;
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[] w={ 0,0,0,0,0,0};                    //passing array
        ARRAYPRACTICE kk=new ARRAYPRACTICE();
        kk.passingarray(w);


        int[] a1 = {1, 2, 3, 4, 5, 6};                  //arraycreation
        int[] a2 = new int[5];
        a2[1]=99;
        a2[2]=100;                                       //insertarray
        a2[4]=89;

        for (int a : a1) {
            System.out.println(a);
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for (int aa : a2) {
            System.out.println(aa);
        }
        a2[1]=99;
        a2[2]=100;
        a2[4]=89;
        System.out.println(Arrays.toString(a2));
        for(int a=0;a<a2.length;a++){
            System.out.println("Array");
        }
        Scanner ss=new Scanner(System.in);
        for (int k=0;k<a2.length;k++){
            System.out.println(k+"enter the number");
            a2[k]=ss.nextInt();
        }
        for(int k:a2){
            System.out.println(k);             //for access above "for" looping statement using "scanner class"
        }
        String[]dept={"METT","CSE","EEE","ECE","MECH","CIVIL"};
        System.out.println(dept.length);
        Scanner NN=new Scanner(System.in);
        System.out.println("enter the position ");
        int position=NN.nextInt();
        System.out.println("which department you want to change/update");
        String update=NN.next();
        dept[position]=update;                                        //update Array
        System.out.println("after changing the department");
        System.out.println(Arrays.toString(dept));
        Scanner nn=new Scanner(System.in);
        for(int A=0;A< dept.length;A++){
            System.out.println("Enter the department Name");
            String name= nn.next();                                        //SEARCH ARRAY
            if(name.equalsIgnoreCase(dept[A]))
            {
                System.out.println("department is available");
            }
            else
            {
                System.out.println("Not available");
            }
        }

    }

}

