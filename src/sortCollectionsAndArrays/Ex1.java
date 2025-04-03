package sortCollectionsAndArrays;

import java.util.Set;
import java.util.TreeSet;

//    What is the result?

record Employee(String name, int age) implements Comparable<Employee> {
    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }

    @Override
    public int compareTo(Employee o) {
        return o.age - this.age;
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Mateusz", 31));
        employees.add(new Employee("Sylwia", 23));
        employees.add(new Employee("Tomasz", 42));
        employees.add(new Employee("Agnieszka", 29));

        System.out.println(employees); // [{Tomasz, 42}, {Mateusz, 31}, {Agnieszka, 29}, {Sylwia, 23}]
    }
}
