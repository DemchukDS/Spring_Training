package demchukDS.treinForAston.spring_introduction.Tests;

import demchukDS.treinForAston.spring_introduction.Cat;
import demchukDS.treinForAston.spring_introduction.Dog;
import demchukDS.treinForAston.spring_introduction.Pet;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
        Pet pet2 = new Cat();
        pet2.say();
    }
}
