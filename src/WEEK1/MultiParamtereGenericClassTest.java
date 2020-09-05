package WEEK1;

class PairData<T, V> {
    private T x;
    private V y;

    public PairData(T a, V b) {
        x = a;
        y = b;
    }

    public T getTvalue() {
        return x;
    }

    public V getVvalue() {
        return y;
    }

    public void printData() {
        System.out.println(getTvalue() + "," + getVvalue());
    }
}

public class MultiParamtereGenericClassTest {
    public static void main(String[] args) {
        PairData<String, String> a = new PairData<String, String>("Debasis", "Samanta");
        a.printData();

        PairData<String, Integer> b = new PairData<String, Integer>("Debasis", 769);
        b.printData();

        PairData<Integer, String> c = new PairData<Integer, String>(943, "Samanta");
        c.printData();

        PairData<Integer, Double> d = new PairData<Integer, Double>(555, 12.34);
        d.printData();
    }
}
