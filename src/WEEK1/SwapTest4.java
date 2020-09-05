package WEEK1;

class Person {
    String name;
    float marks;

    Person(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class SwapTest4 {
    public static void swap(Object x, Object y) {
        Object t;
        t = x;
        x = y;
        y = t;
    }

    public static void main(String[] args) {
        Object p1 = new Person("Sumit", (float) 99.9);
        Object p2 = new Person("Rahul", (float) 66.6);

        System.out.println("p1 = " + p1 + " " + "y = " + p2);

        swap(p1, p2);

        System.out.println("p1 = " + p1 + " " + "y = " + p2);
    }

}
