package pro.tompark.test.spring.yml.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "favorite")
public class FruitProperties {

    private List<Fruit> fruits;

    @Data
    public static class Fruit {
        private String name;
        private String color;
    }
}
