package tn.mscvs.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.mscvs.currencyexchange.domain.Exchange;

public interface CurrencyExchangeRepository extends JpaRepository<Exchange, Long> {

    Exchange findExchangeByFromAndTo(String from, String to);
}
