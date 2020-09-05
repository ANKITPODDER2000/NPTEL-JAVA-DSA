package WEEK1;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

class GenericClass1<T> {
    T obj;

    GenericClass1(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

public class GenericClassTest1 {
    public static void main(String[] args) {
        GenericClass1<Integer> iObj = new GenericClass1<Integer>(15);

        System.out.println(iObj.getObject());

        GenericClass1<String> sObj = new GenericClass1<String>("Java");
        System.out.println(sObj.getObject());

        Student st = new Student("Debasis", 99.9);

        GenericClass1<Student> tObj = new GenericClass1<Student>(st);
        System.out.println(tObj.getObject());
    }
}
