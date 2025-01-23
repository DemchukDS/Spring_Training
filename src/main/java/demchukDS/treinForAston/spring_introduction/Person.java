package demchukDS.treinForAston.spring_introduction;

public class Person {
    private Pet pet;
    private int age;
    private String firstName;
    private String lastName;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
    public Person() {
        System.out.println("Person bean has created!");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Class Person: set firstName");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Class Person: set lastName");
        this.lastName = lastName;
    }
}
