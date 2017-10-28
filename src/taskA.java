public class taskA {
    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 20;

        System.out.println(x+ " "+y);
        swap(x,y);
        System.out.println(x+ " "+y);

    }
    private static void swap(Integer x,Integer y)
    {
        int e = x;
        x= y;
        y= e;
        System.out.println(x+" "+y);
    }
}
