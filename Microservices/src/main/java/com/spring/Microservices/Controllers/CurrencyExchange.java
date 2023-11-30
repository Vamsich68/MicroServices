package com.spring.Microservices.Controllers;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Data
@Entity
public class CurrencyExchange {
    @Id
    private  long id;
    @Column(name = "exchange_from")
    private String from;
    @Column(name = "exchange_to")
    private  String to;
    private BigDecimal conversionMultiple;
    private String environment;
}
