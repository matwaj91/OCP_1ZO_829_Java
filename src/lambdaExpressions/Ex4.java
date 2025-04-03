package lambdaExpressions;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Ex4 {

//  What is the result?

    public static void main(String[] args) {
        Collection<Integer> list = List.of(100, 100, 100); //Line n1
        Collection<Integer> set = new LinkedHashSet<>(list); //Line n2

        //set.forEach((set) -> System.out.print(set)); //Line n3 <- compilation error

//  lambda parameter 'set' has already been declared in the enclosing scope
    }
}
