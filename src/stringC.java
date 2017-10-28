import java.util.Scanner;

public class stringC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = sc.nextLine();
        if(Compare(s,str))
        {
            System.out.println("yes");
        } else  {
            System.out.println("no");
        }
    }
    private static boolean Compare (String s, String str)
    {
        char[] ss = s.toCharArray();
        char[] strr = str.toCharArray();
        int m = ss.length;

        if(m<strr.length){m=strr.length;}
        try {
            for (int i = 0; i <m ; i++) {
                if (ss[i] != strr[i])
                {
                    return false;
                }
            }
        } catch (Exception ex)
        {
            return false;
        }
        return true;


    }
}
