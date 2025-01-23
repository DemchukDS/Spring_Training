package demchukDS.treinForAston.spring_introduction;

public class Dog implements Pet {

    private String name;

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
    public Dog() {
        System.out.println("Dog bean has created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
