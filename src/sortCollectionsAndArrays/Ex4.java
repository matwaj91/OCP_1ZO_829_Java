package sortCollectionsAndArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex4 {

//  What is the result?

    public static void main(String[] args) {
        List<String> list = Arrays.asList("M", "R", "A", "P");
        Collections.sort(list, null);
        System.out.println(list); // [A, M, P, R]
    }

//    If null Comparator is passed to sort method, then elements are sorted in natural order
}
