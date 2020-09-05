package WEEK1;

class SpecificArrayString {
    String[] c;

    SpecificArrayString(String[] c) {
        this.c = c;
    }

    void printString() {
        for (String x : c) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void reverseString() {
        int j = c.length - 1;

        for (int i = 0; i < j; i++) {
            String temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
    }
}

public class MainClassString {
    public static void main(String[] args) {
        SpecificArrayString c = new SpecificArrayString(new String[]{"A", "B", "C", "D", "E"});

        c.printString();
        c.reverseString();
        c.printString();
    }
}
