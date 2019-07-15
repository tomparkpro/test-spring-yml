package pro.tompark.test.spring.yml.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties(prefix = "favorite")
@Configuration
@Data
public class FruitProperties {

    private List<Fruit> fruits;

    @Data
    public static class Fruit {
        private String name;
        private String color;
    }
}
