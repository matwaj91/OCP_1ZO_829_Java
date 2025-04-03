package collectionAPI;

import java.util.Set;
import java.util.TreeSet;

// What is the result?

record Student1(String name, int age) {}

public class Ex2 {

    public static void main(String[] args) {
        Set<Student1> students = new TreeSet<>();
        students.add(new Student1("Samuel", 21));
        students.add(new Student1("Samuel", 21));
        students.add(new Student1("Samuel", 21));

        System.out.println(students.size());
    }

    //  ClassCastException

//    TreeSet requires to provide either Comparable or Comparator. If we don't provide Comparator explicitly,
//    then for natural ordering your class should implement Comparable interface.
}
