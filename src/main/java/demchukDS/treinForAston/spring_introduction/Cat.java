package demchukDS.treinForAston.spring_introduction;

public class Cat implements Pet{
    public void say() {
        System.out.println("Meow-Meow");
    }

    public Cat() {
        System.out.println("Cat bean has created!");
    }
}
