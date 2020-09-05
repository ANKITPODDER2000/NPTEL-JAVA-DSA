package WEEK1;

class SpecificArrayDouble {
    double[] b;

    SpecificArrayDouble(double[] b) {
        this.b = b;
    }

    void printDouble() {
        for (double x : b) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void reverseDouble() {
        int j = b.length - 1;

        for (int i = 0; i < j; i++) {
            double temp = b[i];
            b[i] = b[j];
            b[j] = temp;

            j--;
        }
    }
}

public class MainClassDouble {
    public static void main(String[] args) {
        SpecificArrayDouble b = new SpecificArrayDouble(new double[]{1.2, 2.3, 3.4, 4.5, 5.6});

        b.printDouble();
        b.reverseDouble();
        b.printDouble();
    }
}
