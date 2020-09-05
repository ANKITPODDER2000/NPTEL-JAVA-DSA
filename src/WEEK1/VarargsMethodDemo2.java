package WEEK1;

public class VarargsMethodDemo2 {

    static void varargsMethod2(int... v) {
        System.out.print("Number of arguments: " + v.length);

        for (int i : v) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        varargsMethod2(9);
        varargsMethod2(1, -2, 3, 4);
        varargsMethod2();
    }
}
