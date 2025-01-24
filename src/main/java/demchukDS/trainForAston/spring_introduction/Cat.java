package demchukDS.trainForAston.spring_introduction;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean has created!");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
