import java.util.Scanner;

public class stringD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s =sc.nextLine().split(" ");
        int m = 0; int d = 0;
        for (int i = 0; i <s.length ; i++) {
            if(m<s[i].length()){
                m=s[i].length();
                d = i;
            }
        }
        System.out.println(s[d]);
        System.out.println(m);
    }
}
