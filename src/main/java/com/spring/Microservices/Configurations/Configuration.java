package com.spring.Microservices.Configurations;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Configuration {
    private int minimum;
    private int maximum;

}
