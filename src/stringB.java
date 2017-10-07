import java.util.Scanner;

public class stringB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ToUpper(ch));
    }

    public static char ToUpper(char c) {
        if (64<c && c < 91) {
            c += 32;
        } else if (96<c && c < 123){
c-=32;
        }
    return c;
    }
}
