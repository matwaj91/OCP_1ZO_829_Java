package methodReferences;

// What is the result?

interface Writer {

    void print(Object obj);
}

public class Ex5 {

    public static void main(String[] args) {
        Writer obj = System.out::print;
        obj.print("BE HONEST");
    }

//    BE HONEST
}
