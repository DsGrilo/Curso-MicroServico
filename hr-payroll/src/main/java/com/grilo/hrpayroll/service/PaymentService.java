package com.grilo.hrpayroll.service;

import com.grilo.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {



    public Payment getPayment(long workerId, int days){
        return new Payment("Daniel", new BigDecimal(200), days);
    }
}
