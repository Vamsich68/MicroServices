package com.MicroServices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class apiGatewayConfiguration {
    @Bean
    public RouteLocator getwayRouter(RouteLocatorBuilder builder){
        return builder.routes()
                .route(
                        p->p.path("/currency-exchange/**")
                        .uri("lb://currency-exchange"))
                .route(p -> p.path("/currency-conversion/**")
                        .uri("lb://currency-conversion"))
                .build();
    }
}
