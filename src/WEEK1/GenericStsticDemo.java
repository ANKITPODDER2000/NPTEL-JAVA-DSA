package WEEK1;

public class GenericStsticDemo {
    static <T> void gPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        gPrint(101);

        gPrint("Joy with Java");

        gPrint(3.1412343);
    }
}
