package WEEK1;

class GenericClass2<T> {
    T obj;

    GenericClass2(T obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println(obj);
    }
}

public class GenericStaticDemo2 {
    public static void main(String[] args) {
        GenericClass2<String> s = new GenericClass2<String>("Joy with Java");
        GenericClass2<Double> d = new GenericClass2<Double>(1.233);

        s.print();
        d.print();
    }
}
