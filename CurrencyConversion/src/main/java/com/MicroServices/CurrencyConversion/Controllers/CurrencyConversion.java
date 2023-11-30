package com.MicroServices.CurrencyConversion.Controllers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
@Entity
public class CurrencyConversion {
    @Id
    private Long id;
    @Column(name = "exchange_from")
    private String from;
    @Column(name = "exchange_to")
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
    private String environment;

}
