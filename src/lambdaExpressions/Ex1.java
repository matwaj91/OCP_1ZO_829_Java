package lambdaExpressions;

//  What is the result?

interface ITester {
    void test();
}

public class Ex1 {
    public static void main(String[] args) {
        ITester obj = () -> System.out.println("KEEP CALM");
    }

//    Program compiles and executes successfully but nothing is printed on to the console.
//    Lambda expression is defined correctly but test() method is not invoked on obj reference. So, no output.
}
