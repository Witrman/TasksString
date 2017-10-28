public class taskG
{
    public static void main(String[] args) {
        int[] d = new int[]{1, 2, 3, 1, 2, 1, 4, 1, 5, 2, 6, 3, 5, 4, 2, 4, 2, 1,4};
        System.out.println(max(d));
    }
    private static int max(int[] d)
    {
        int max =0;
        for (int i = 0; i < d.length; i++) {
            if(d[i]>max)
            {
                max=d[i];
            }
        }

        return max;
    }
}