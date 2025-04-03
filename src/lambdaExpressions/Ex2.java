package lambdaExpressions;

// What is the result?

interface Printable {

    void print();
    boolean equals(Object obj);
}

public class Ex2 {

    public static void main(String[] args) {
        Printable obj = () -> System.out.println("AIM HIGH");
        obj.print(); // AIM HIGH
    }
}

