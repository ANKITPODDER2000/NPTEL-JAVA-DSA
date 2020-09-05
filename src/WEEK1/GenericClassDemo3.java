package WEEK1;

class GenericClass3<T> {
    T obj;

    GenericClass3(T Obj) {
        this.obj = obj;
    }
}

public class GenericClassDemo3 {
    public static void main() {
        GenericClass3<Integer> a = new GenericClass3<Integer>(123);

        GenericClass3<String> s = new GenericClass3<String>("Joy with Java");

        GenericClass3<Double> d = new GenericClass3<Double>(1.23);
    }
}
