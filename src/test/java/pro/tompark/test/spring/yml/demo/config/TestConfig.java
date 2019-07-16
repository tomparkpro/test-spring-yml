package pro.tompark.test.spring.yml.demo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses={AppConfiguration.class})
public class TestConfig {

}

