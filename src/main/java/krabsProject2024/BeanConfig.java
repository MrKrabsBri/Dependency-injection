package krabsProject2024;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//using Java configuration
@Configuration
@ComponentScan(basePackages = "krabsProject2024")
public class BeanConfig {

    //cia declarinam bean
//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }

}
