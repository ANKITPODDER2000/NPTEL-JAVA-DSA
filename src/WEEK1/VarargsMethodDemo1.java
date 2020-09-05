package WEEK1;

public class VarargsMethodDemo1 {

    static void varargsMethod1(int v[]) {
        System.out.print("Number of args: " + v.length + " Elements : ");

        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int x[] = {1, 3, 5, 7};
        int y[] = {2, 4};
        int z[] = {};

        varargsMethod1(x);
        varargsMethod1(y);
        varargsMethod1(z);
    }
}
