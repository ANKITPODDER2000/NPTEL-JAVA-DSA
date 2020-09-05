package WEEK1;

class GenericArray<T> {
    T[] a;

    GenericArray(T[] x) {
        a = x;
    }

    T getData(int i) {
        return a[i];
    }

    void printData(T[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(getData(i) + " ");
        }
        System.out.println();
    }

    void reverseArray(T[] b) {
        int front = 0, rear = b.length - 1;
        T temp;
        while (front < rear) {
            temp = b[rear];
            b[rear] = a[front];
            a[front] = temp;
            front++;
            rear--;
        }
    }

}

public class GenericClassArrayDemo {
    public static void main(String[] args) {
        Integer[] x = {10, 20, 30, 40, 50};

        GenericArray<Integer> aInt = new GenericArray<Integer>(x);

        aInt.printData(x);
        aInt.reverseArray(x);
        aInt.printData(x);
    }
}
