package com.dev.type;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class UnofficialSummary {

    private BigDecimal active;

    private BigDecimal deaths;

    private BigDecimal recovered;

    private String source;

    private BigDecimal total;
}
