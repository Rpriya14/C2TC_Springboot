package com.tnsif.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(
    scanBasePackages = {
        "com.tnsif.placement", 
        "com.tnsif.PlacementManagement_College"  // explicitly include your package
    }
)
@EnableJpaRepositories(basePackages = "com.tnsif.PlacementManagement_College") // for repository
@EntityScan(basePackages = "com.tnsif.PlacementManagement_College") // for entity
public class PlacementManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlacementManagementApplication.class, args);
        System.out.println("Spring Boot Application Started...");
    }
}
