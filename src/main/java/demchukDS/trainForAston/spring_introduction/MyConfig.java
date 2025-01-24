package demchukDS.trainForAston.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean() {
        return new Person(catBean());
    }
}
