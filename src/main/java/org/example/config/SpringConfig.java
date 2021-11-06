package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 85217
 */
@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("org.example")
@Import({DataSourceConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
