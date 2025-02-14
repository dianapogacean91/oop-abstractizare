package abstract_classes;

import abstract_classes.animals.Animal;
import abstract_classes.animals.Beagle;
import abstract_classes.animals.Cat;
import abstract_classes.animals.Dog;

public class Main {
    public static void main(String[] args) {

//        Beagle dog = new Beagle("rex");

        //abstract class cannot be instantiated
        //Dog dog1 = new Dog("ddd");

       // System.out.println("Hello world!");


        //upcasting - convertire a subclasei in superclasa
        Animal cat = new Cat("kdjfkd");
        Animal dog = new Beagle("dddd");

        cat = dog;

        cat.makeNoise();

        Cat cat1 = new Cat("dddd");
        //downcasting - convert superclass back to subclass
        Animal animal = (Animal) cat1;

    }
}