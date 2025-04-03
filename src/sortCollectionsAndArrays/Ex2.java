package sortCollectionsAndArrays;

import java.util.Arrays;

public class Ex2 {

// What is the result?

    public static void main(String[] args) {
        String [] arr = {"**", "***", "*", "*****", "****"};
        Arrays.sort(arr, (s1, s2) -> s1.length()-s2.length());
        for(String str : arr) {
            System.out.println(str);
        }
    }

//            *
//            **
//            ***
//            ****
//            *****

}
