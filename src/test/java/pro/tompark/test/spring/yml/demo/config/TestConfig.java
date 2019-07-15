package pro.tompark.test.spring.yml.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pro.tompark.test.spring.yml.demo.config.AppConfiguration;

@Configuration
@ComponentScan(basePackageClasses={AppConfiguration.class})
public class TestConfig {

}

