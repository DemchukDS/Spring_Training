package demchukDS.treinForAston.spring_introduction.Tests;

import demchukDS.treinForAston.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
