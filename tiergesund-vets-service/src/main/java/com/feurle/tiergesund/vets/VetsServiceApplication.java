package com.feurle.tiergesund.vets;

import com.feurle.tiergesund.vets.system.VetsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties(VetsProperties.class)
public class VetsServiceApplication {

    /**
     * Uses Spring Boot's run method to launch this VetsService application.
     *
     * @param args application arguments for startup
     */
    public static void main(String[] args) {
        SpringApplication.run(VetsServiceApplication.class, args);
    }
}
