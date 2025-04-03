package methodReferences;

interface Creator<T> {

    T create(String type);
}

enum AnimalType {

    MAMMAL, BIRD, REPTILE;
}

abstract class Animal {

    private AnimalType type;

    public Animal(AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }
}

class Dog extends Animal {

    public Dog(String type) {
        super(AnimalType.valueOf(type.toUpperCase())); //Line n1
    }
}

public class Ex2 {

    public static void main(String[] args) {
        Creator<Dog> obj = Dog::new; //Line n2
        var d = obj.create("mammal"); //Line n3
        System.out.println(d.getType()); //Line n4
    }

//  MAMMAL
}
