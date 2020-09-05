package WEEK1;

class Student2<T extends Number> {
    String name;
    T[] marks;

    Student2(T[] m) {
        marks = m;
    }

    double total() {
        double sum = 0.0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].doubleValue();
        }

        return (sum);
    }

    boolean compareMarks(Student2<T> others) {
        if (total() == others.total()) {
            return true;
        }

        return false;
    }
}

public class GenericLimitationDemo {
    public static void main(String[] args) {
        Integer[] intMarks1 = {44, 55, 33, 66, 77};
        Student2<Integer> s1IntMarks = new Student2<Integer>(intMarks1);
        System.out.println("Total marks " + s1IntMarks.total());

        Integer[] intMarks2 = {49, 39, 53, 69};
        Student2<Integer> s2IntMarks = new Student2<Integer>(intMarks2);
        System.out.println("Total marks " + s2IntMarks.total());

        if (s1IntMarks.compareMarks(s2IntMarks)) {
            System.out.println("Same marks.");
        } else {
            System.out.println("Different marks.");
        }

        Double[] doubleMarks = {43.5, 55.5, 32.5, 66.5, 77.0};
        Student2<Double> s3DoubleMarks = new Student2<Double>(doubleMarks);
        System.out.println("Total marks " + s3DoubleMarks);

        Float[] floatMarks = {50.0F, 40.0F, 60.0F, 65.0F};
        Student2<Float> s4FloatMarks = new Student2<Float>(floatMarks);
        System.out.println("Total marks " + s4FloatMarks);

//        if(s2IntMarks.compareMarks(s3DoubleMarks)) {
//            System.out.println("Same marks.");
//        } else {
//            System.out.println("Different marks.");
//        }

//        if(s3DoubleMarks.compareMarks(s4FloatMarks)) {
//            System.out.println("Same marks.");
//        } else {
//            System.out.println("Different marks.");
//        }
    }
}
