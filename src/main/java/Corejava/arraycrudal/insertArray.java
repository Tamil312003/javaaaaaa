package Corejava.arraycrudal;

import java.util.Arrays;
import java.util.Scanner;

public class insertArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[5] = 8987;
        arr[9] = 87654;
        System.out.println(Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter your  number");
            arr[i] = scan.nextInt();
        }

        for (int sam : arr) {
            System.out.println(sam);
        }
    }
}



