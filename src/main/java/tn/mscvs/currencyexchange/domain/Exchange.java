package tn.mscvs.currencyexchange.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exchange {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversion;
}
