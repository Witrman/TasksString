public class taskC {
    public static void main(String[] args) {
        int[] a = new int[]{2,1,2,4,5,1,2,4,6,5,2};
        sha(  a);
    }
    private static void sha(int[] a)
    {
        for (int d:a) {
            System.out.print(d+" ");
        }
    }
}
