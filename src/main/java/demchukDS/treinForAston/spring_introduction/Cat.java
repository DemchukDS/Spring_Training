package demchukDS.treinForAston.spring_introduction;

public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean has created!");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
