package collectionAPI;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// What is the result?

class Student {

    String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Bill", 25));
        students.add(new Student("Bill", 25));
        students.add(new Student("Bill", 26));

        System.out.println(students.size()); // 3
    }

    // To avoid duplicate in the given Set, hashCode() method should be overriden.
}
