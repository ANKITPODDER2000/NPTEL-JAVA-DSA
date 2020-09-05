//package WEEK1;
//
//class Student1 {
//    String name;
//    int[] marks = new int[3];
//
//    Student1(String s, int[] m) {
//        name = s;
//        marks = m;
//    }
//
//    void printStudent1() {
//        System.out.println("Name : " + name);
//        System.out.println("Scores : " + marks[0] + " " + marks[1] + " " + marks[2]);
//    }
//}
//
//class GenericMultiArrays<T, S> {
//    T[] a;
//    S[] b;
//
//    GenericMultiArrays(T[] x, S[] y) {
//        a = x;
//        b = y;
//    }
//
//    T getDataT(int i) {
//        return a[i];
//    }
//
//    S getDataS(int i) {
//        return b[i];
//    }
//
//    void printData(T[] t) {
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(getDataT(i) + " ");
//        }
//        System.out.println();
//    }
//
//    void printData(S[] s) {
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(getDataS(i) + " ");
//        }
//        System.out.println();
//    }
//
//    void reverseArray(T[] t) {
//        int front = 0, rear = t.length - 1;
//        T temp;
//
//        while (front < rear) {
//            temp = t[rear];
//            t[rear] = t[front];
//            t[front] = temp;
//
//            front++;
//            rear--;
//        }
//    }
//
//    void reverseArray(S[] s) {
//        int front = 0;
//        int rear = s.length - 1;
//
//        S temp;
//
//        while (front < rear) {
//            temp = s[rear];
//            s[rear] = s[front];
//            s[front] = temp;
//
//            front++;
//            rear--;
//        }
//    }
//}
//
//public class GenericMultiArraysDemo {
//    public static void main(String[] args) {
//        String[] t = {"A", "B", "C"};
//
//        Student1[] s = new Student1[3];
//        s[0] = new Student1("Ram", new int[]{86, 66, 96});
//        s[1] = new Student1("Rahim", new int[]{88, 99, 77});
//        s[2] = new Student1("John", new int[]{75, 85, 95});
//
//        GenericMultiArrays<String, Student1> arrayData = new GenericMultiArrays<String, Student1>(t, s);
//
//        arrayData.printData(t);
//
//        arrayData.reverseArray(t);
//
//        arrayData.printData(s);
//
//        arrayData.reverseArray(s);
//
//        arrayData.printData(t);
//
//        arrayData.printData(s);
//    }
//}
