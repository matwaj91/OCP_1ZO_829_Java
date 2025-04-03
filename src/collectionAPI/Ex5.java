package collectionAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex5 {

     //What is the result?

     public static void main(String[] args) {
         Set<String> set = new HashSet<>(Arrays.asList(null,null,null));
         long count = set.stream().count();
         System.out.println(count); // 1
     }

//    HashSet cares about uniqueness and allows 1 null value.

}
