import java.util.Random;

public class taskJ {
    public static void main(String[] args) {

        int[] a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        sha(a);
    }
    private static void sha(int[] a)
    {
        Random r =new Random();
        int buf=0;
        int f =0;
        for (int i = 0; i <a.length ; i++) {
            f =r.nextInt(15);
            buf=a[i];
            a[i]=a[f];
            a[f]=buf;
        }

    }
}
