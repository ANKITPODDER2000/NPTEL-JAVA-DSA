package WEEK1;

public class SwapTest2 {

    public static <T> void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Double x = new Double(99.0);
        Double y = new Double(66.0);

        System.out.println("x = " + x + " " + "y = " + y);

        swap(x, y);

        System.out.println("x = " + x + " " + "y = " + y);
    }
}
