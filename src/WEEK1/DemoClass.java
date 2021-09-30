package WEEK1;

public class DemoClass {
    <T> void genericPrint(T t) {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        DemoClass aObj = new DemoClass();

        aObj.genericPrint(10178);
        aObj.genericPrint("Joy with Java \");
        aObj.genericPrint(3.1412343234);
    }
}
