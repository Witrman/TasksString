import java.util.Scanner;

public class taskF {
    public static void main(String[] args) {

        int[] d = new int[]{1, 2, 3, 1, 2, 1, 4, 1, 5, 2, 6, 3, 5, 4, 2, 4, 2, 1,4};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for ( int f:d ) {
            System.out.print(f+" ");
        }
        System.out.println();
        change(d,a,b);

    }
    private static void change(int[] d, int a, int b)
    {
        d[a]=b;
        for (int f:d
                ) {
            System.out.print(f+" ");

        }
    }
}
