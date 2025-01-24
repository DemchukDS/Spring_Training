package demchukDS.trainForAston.spring_introduction.Tests;

import demchukDS.trainForAston.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog = context.getBean("dogBean", Dog.class);
        Dog dog2 = context.getBean("dogBean", Dog.class);

        System.out.println(dog == dog2);
        System.out.println(dog);
        System.out.println(dog2);

        context.close();
    }
}
