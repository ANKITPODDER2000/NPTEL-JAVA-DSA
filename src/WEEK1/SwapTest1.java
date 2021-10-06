package WEEK1;

public class SwapTest1 {
    public static <T> void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static <T> void swap1(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }
    
     public static <T> void swap2(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }
    
     public static <T> void swap3(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Integer x = new Integer(99);
        Integer y = new Integer(66);

        System.out.println("x = " + x + " " + "y = " + y);

        swap(x, y);

        System.out.println("x = " + x + " " + "y = " + y);

        swap1(x, y);

        System.out.println("x = " + x + " " + "y = " + y);
        
        swap2(x, y);

        System.out.println("x = " + x + " " + "y = " + y);
        
        swap3(x, y);

        System.out.println("x = " + x + " " + "y = " + y);
    }
}
