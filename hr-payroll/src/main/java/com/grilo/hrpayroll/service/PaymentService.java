package com.grilo.hrpayroll.service;

import com.grilo.hrpayroll.entity.Payment;
import com.grilo.hrpayroll.entity.WorkerModel;
import com.grilo.hrpayroll.feignclients.WorkerFerignClients;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFerignClients feignClient;

    public Payment getPayment(long workerId, int days){

        WorkerModel worker = feignClient.findById(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
