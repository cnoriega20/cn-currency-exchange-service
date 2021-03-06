package tn.mscvs.currencyexchange.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.mscvs.currencyexchange.domain.Exchange;
import tn.mscvs.currencyexchange.repository.CurrencyExchangeRepository;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment env;

    private final CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping("/currency-exchange/get")
    public Exchange getExchangeRate(@RequestParam("from") String from,
                                     @RequestParam("to") String to){

        Exchange exchange = currencyExchangeRepository.findExchangeByFromAndTo(from, to);
        exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        log.info("{}", exchange);

        return exchange;

    }
}
