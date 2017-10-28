import java.util.Scanner;

public class taskD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] d = new int[]{1,2,3,1,2,1,4,1,5,2,6,3,5,4,2,4,2,1};
        Sum(d,a,b);
    }
    private static void Sum(int[] d,int a,int b)
    {
        int sum = 0;
        for (int i = a; i <b ; i++) {
            sum+=d[i];
        }
        System.out.println(sum);
    }
}
