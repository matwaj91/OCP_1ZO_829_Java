package methodReferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// What is the result?

record Student(String name, int age) {

    public String toString() {
        return "Student (" + name + ", " + age + ")";
    }

    public static int compareByAge(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class Ex1 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("john", 25),
                new Student("lucy", 21),
                new Student("ivy", 23));
        Collections.sort(students, Student::compareByAge);
        System.out.println(students);
    }

//    [Student (lucy, 21), Student (ivy, 23), Student (john, 25)]
}