package org.elanfox.cloud.archetype.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author allan
 * @date 2019-08-26
 */
@SpringBootApplication(scanBasePackages = {"org.elanfox.cloud", "org.elanfox.cloud.archetype"})
@EntityScan(basePackages = "org.elanfox.cloud.archetype.biz.entity")
@EnableJpaRepositories(basePackages = "org.elanfox.cloud.archetype.biz.repository")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
