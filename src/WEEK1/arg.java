package WEEK1;

public class VarargsMethodDemo3 {

    public static void varargsMethod3(Object ...obj) {
        for(Object o : obj) {
            System.out.print(" " + o);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        varargsMethod3(67, "Deb", 2.4, true);
        varargsMethod3();
        varargsMethod3(12, 56, 78, 34);
    }
}