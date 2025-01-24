package demchukDS.trainForAston.spring_introduction.Tests;

import demchukDS.trainForAston.spring_introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        context.close();
    }
}
