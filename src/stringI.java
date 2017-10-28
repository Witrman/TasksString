import java.util.Scanner;

public class stringI {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().replace(" ","").toCharArray();
        String str = "yes";
        for (int i = 0; i <s.length/2 ; i++) {
                if(s[i]!=s[s.length-i-1])
                {
                    str = "no";
                }
        }
        System.out.println(str);
    }
}
