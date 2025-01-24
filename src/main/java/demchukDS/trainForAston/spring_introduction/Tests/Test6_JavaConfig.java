package demchukDS.trainForAston.spring_introduction.Tests;

import demchukDS.trainForAston.spring_introduction.MyConfig;
import demchukDS.trainForAston.spring_introduction.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6_JavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.getAge() + " years old");
//        person.callYourPet();

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat1.say();


        context.close();
    }
}
