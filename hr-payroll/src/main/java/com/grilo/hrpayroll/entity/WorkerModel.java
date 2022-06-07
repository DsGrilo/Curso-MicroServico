package com.grilo.hrpayroll.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkerModel implements Serializable{
    private Long id;
    private String name;
    private BigDecimal dailyIncome;
}
