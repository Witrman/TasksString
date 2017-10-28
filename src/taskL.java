import java.util.Random;
import java.util.Scanner;

public class taskL {
    public static void main(String[] args) {
        int[] a = new int[15];
        Random r =new Random();
        for (int i = 0; i <a.length ; i++) {
            a[i] = r.nextInt(100);
        }
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int b = sc. nextInt();
        for (int d:a
             ) {
            System.out.print(d+" ");
        }
        System.out.println();
        cl(a,x,b);
    }
    private static void cl(int[] a, int x, int b)
    {
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<x) {  a[i]=x;  }
            if(a[i]>b) {  a[i]=b;  }
            System.out.print(a[i]+" ");
        }

    }

}
