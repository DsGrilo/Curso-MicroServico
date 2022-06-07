package com.grilo.hrpayroll.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment  implements Serializable {
    private String name;
    private BigDecimal dailyIncome;
    private int days;

    public BigDecimal getTotal(){
        return  dailyIncome.multiply(BigDecimal.valueOf(days));
    }

}
