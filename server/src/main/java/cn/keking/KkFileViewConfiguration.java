package cn.keking;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author kelvin
 */
@EnableScheduling
@ComponentScan(value = "cn.keking.*")
@Configuration
public class KkFileViewConfiguration {
}
