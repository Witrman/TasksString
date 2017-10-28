import java.util.Scanner;

public class taskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        correct(a);
        System.out.println(a);
    }

    private static void correct(Integer a)
    {
        if(a<0)
        {
            a=null;
        }
    }
}
