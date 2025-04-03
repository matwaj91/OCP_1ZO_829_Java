package collectionAPI;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ex3 {

//  What is the result?

    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>(Arrays.asList('a','b','c','A','a','c'));
        set.stream().forEach(System.out::print); // Aabc
    }

//  Character and all wrapper classes implement Comparable interface, hence Characters are sorted in ascending order.
//  Uppercase characters appears before lowercase characters.
}
