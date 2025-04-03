package methodReferences;

// What is the result?

interface DoubleToByte {

    byte getValue();
}

public class Ex4 {

    public static void main(String[] args) {
        DoubleToByte obj = Double.valueOf("123")::byteValue;
        System.out.println(obj.getValue());
    }

//    123
}

