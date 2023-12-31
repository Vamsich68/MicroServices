package com.spring.Microservices.Controllers;

import com.spring.Microservices.data.CurrencyJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyJPARepository currencyJPARepository;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveCurrencyExchange(@PathVariable String from, @PathVariable String to)
    {

        CurrencyExchange currencyExchange=  currencyJPARepository.findByFromAndTo(from,to);
        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        return currencyExchange;

    }

}
