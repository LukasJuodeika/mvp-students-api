package johnny.tutorial.restfulspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import johnny.tutorial.restfulspringboot.property.ApiUrlProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    ApiUrlProperties.class
})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
