package demchukDS.treinForAston.spring_introduction.Tests;

import demchukDS.treinForAston.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        myDog.setName("Lexie");
        yourDog.setName("Vupsen'");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }
}
