package tn.mscvs.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CnCurrencyExchangeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnCurrencyExchangeServiceApplication.class, args);
    }

}
