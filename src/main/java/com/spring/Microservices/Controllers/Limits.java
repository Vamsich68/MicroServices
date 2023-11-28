package com.spring.Microservices.Controllers;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Limits {
    private int minimum;
    private int maximum;
}
