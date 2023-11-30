package com.spring.Microservices.data;

import com.spring.Microservices.Controllers.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyJPARepository extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
