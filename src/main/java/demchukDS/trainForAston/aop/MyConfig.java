package demchukDS.trainForAston.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("demchukDS.trainForAston.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
