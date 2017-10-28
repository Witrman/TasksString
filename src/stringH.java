import java.util.Scanner;

public class stringH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int x =0; int y=0;
        for (int i = 0; i <s.length ; i+=2) {
            switch (s[i]){
                case "North" :
                {
                    y+=Integer.parseInt(s[i+1]);
                    break;
                }
                case "South" :
                {
                    y-=Integer.parseInt(s[i+1]);
                    break;
                }
                case "East" :
                {
                    x+=Integer.parseInt(s[i+1]);
                    break;
                }
                case "West" :
                {
                    x-=Integer.parseInt(s[i+1]);
                    break;
                }
            }
        }
        System.out.println(x+" "+y);
    }
}
