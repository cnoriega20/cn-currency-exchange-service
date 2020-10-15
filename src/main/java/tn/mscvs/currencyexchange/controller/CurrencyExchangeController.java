package tn.mscvs.currencyexchange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.mscvs.currencyexchange.domain.Exchange;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/get")
    public Exchange getExchangeRate(@RequestParam("from") String from,
                                     @RequestParam("to") String to){
        return Exchange.builder().
                id(1L)
                .from(from)
                .to(to)
                .conversion(BigDecimal.valueOf(65))
                .build();

    }
}
