package WEEK1;

class GenericBound<T extends Number> {
    T[] array;

    GenericBound(T[] t) {
        array = t;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }

        return sum / array.length;
    }
}

public class GenericBoundDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericBound<Integer> intdata = new GenericBound<Integer>(intArray);

        double avgInt = intdata.average();
        System.out.println("Average is " + avgInt);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericBound<Double> doubleData = new GenericBound<Double>(doubleArray);

        double avgDouble = doubleData.average();
        System.out.println("Average is " + avgDouble);

//        String[] strArray = {"1", "2", "3", "4", "5"};
//        GenericBound<String> strData = new GenericBound<String>(strArray);
//
//        double avgStr = strData.average();
//        System.out.println("Average is " + avgStr);
    }
}
