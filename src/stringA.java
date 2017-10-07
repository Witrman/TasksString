import java.io.IOException;
import java.util.Scanner;

public class stringA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isDigit(s))
        { System.out.println("yes");
        }else{ System.out.println("no");
        }

    }

    public static boolean isDigit(String s)
    {
        try {
            Integer.parseInt(s);
            return  true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
}
