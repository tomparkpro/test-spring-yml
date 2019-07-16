package pro.tompark.test.spring.yml.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import pro.tompark.test.spring.yml.demo.config.FruitProperties;
import pro.tompark.test.spring.yml.demo.config.TestConfig;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfig.class)
@ActiveProfiles("test")
public class DemoApplicationTests {

    @Autowired
    FruitProperties fruitProperties;

    @Test
    public void favoriteFruit() {
        for (FruitProperties.Fruit fruit : fruitProperties.getFruits()) {
            log.error("{} is {}.", fruit.getName(), fruit.getColor());
        }
    }

}
