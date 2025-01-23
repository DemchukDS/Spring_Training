package demchukDS.treinForAston.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.age}")
    private int age;
    @Value("${person.firstName}")
    private String firstName;
    @Value("${person.lastName}")
    private String lastName;

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        System.out.println("Person bean has created!");
        this.pet = pet;
    }


    public Person() {
        System.out.println("Person bean has created!");
    }

//    @Qualifier("catBean")
//    @Autowired
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


    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
