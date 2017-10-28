public class taskE {
    public static void main(String[] args) {
        int[] d = new int[]{1,2,3,1,2,1,4,1,5,2,6,3,5,4,2,4,2,1};
        System.out.println(ave(d));
    }
    private static double ave(int[] d)
    {
        double sum =0;
        for (int i = 0; i < d.length; i++) {
            sum+=d[i];
        }
        return sum/d.length;
    }
}
