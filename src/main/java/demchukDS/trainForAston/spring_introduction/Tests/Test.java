package demchukDS.trainForAston.spring_introduction.Tests;

import demchukDS.trainForAston.spring_introduction.Cat;
import demchukDS.trainForAston.spring_introduction.Dog;
import demchukDS.trainForAston.spring_introduction.Pet;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
        Pet pet2 = new Cat();
        pet2.say();
    }
}
