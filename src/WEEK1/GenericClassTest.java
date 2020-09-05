package WEEK1;

class GenericClass <T> {
    private T x;

    public GenericClass(T t) {
        x = t;
    }

    public void printData() {
        System.out.println(x);
    }
}

public class GenericClassTest {
    public static void main(String[] args){
        GenericClass<String> a = new GenericClass<String>("Java");
        a.printData();

        GenericClass<Integer> b = new GenericClass<Integer>(123);
        b.printData();

        GenericClass<Double> c = new GenericClass<Double>(3.142);
        c.printData();
    }
}
