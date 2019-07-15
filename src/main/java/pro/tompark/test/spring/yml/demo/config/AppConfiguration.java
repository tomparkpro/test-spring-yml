package pro.tompark.test.spring.yml.demo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Base configuration of Application referenced in web.xml or via spring setup
 */
@Configuration
@ComponentScan({AppConfiguration.PKG_PREFIX + ".*.config"})
@EnableAutoConfiguration
public class AppConfiguration {
    public static final String PKG_PREFIX = "pro.tompark.test";
}