package lambdaExpressions;

interface Logger {

    String log(byte i, byte j, byte k);
}

public class Ex5 {

    private static String print(Number i, Number j, Number k) {
        return i + ", " + j + ", " + k;
    }

    public static void main(String[] args) {
        Logger obj = Ex5::print; //Line n1
        System.out.println(obj.log((byte)11, (byte)22, (byte)33)); //Line n2
    }

//    11, 22, 33


}
