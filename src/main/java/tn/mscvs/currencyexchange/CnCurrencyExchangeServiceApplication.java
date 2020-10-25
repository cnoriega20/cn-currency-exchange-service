package tn.mscvs.currencyexchange;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CnCurrencyExchangeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnCurrencyExchangeServiceApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

}
