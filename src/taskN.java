import java.util.Random;
import java.util.Scanner;

public class taskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random r = new Random();
        int[] c = new int[a];
        for (int i = 0; i < c.length; i++) {
            c[i] = r.nextInt(100);
            System.out.print(c[i]+" ");
        }
        System.out.println();
        arr(c);


    }
    private static int[] arr(int[] c)
    {
        for (int i = 1; i <c.length-1 ; i++) {
            if(c[i-1]<c[i] && c[i]>c[i+1]){
                System.out.print(c[i]+" ");
            } else {
                System.out.print("0   ");}
        }
        return c;
    }
}
