public class taskI {
    public static void main(String[] args) {
        int[] d = new int[]{1, 2, 3, 1, 2, 1, 4, 1, 5, 2, 6, 3, 5, 4, 2, 4, 2, 1,4};
        int a=d.length-1;
        while (a!=-1)
        {
            System.out.println(a+"   "+d[a]);
            a--;
        }

    }
}
