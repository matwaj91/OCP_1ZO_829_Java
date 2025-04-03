package lambdaExpressions;

// What is the result?

interface MyInterface {

    void calculate();
}

public class Ex3 {

    public static void main(String[] args) {
        MyInterface obj = () ->  {
            int i = 10;
            i++;
            System.out.println(i);
            return;
        };
        obj.calculate();
    }

    // 11
}
