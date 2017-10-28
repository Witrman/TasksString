import java.util.Random;
import java.util.Scanner;

public class taskM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] c = max(a);
        for (int g:c
             ) {
            System.out.print(g+" ");

        }
    }
    private static int[] max(int a) {
        Random r = new Random();
        int[] c = new int[a];
        for (int i = 0; i <a ; i++) {
            c[i] = r.nextInt(100);
        }
        return c;
    }
}
