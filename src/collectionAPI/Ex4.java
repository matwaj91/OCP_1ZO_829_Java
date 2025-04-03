package collectionAPI;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ex4 {

//    What is the result?

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Arrays.asList(null,null,null));
        long count = set.stream().count();
        System.out.println(count);
    }

    // Runtime Exception - TreeSet cannot contain null values.

}
