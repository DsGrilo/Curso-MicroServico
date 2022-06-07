package com.grilo.hrpayroll.service;

import com.grilo.hrpayroll.entity.Payment;
import com.grilo.hrpayroll.entity.WorkerModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String workerHost;

    public Payment getPayment(long workerId, int days){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", String.valueOf(workerId));

        WorkerModel workerModel = restTemplate.getForObject(
                workerHost.concat("/workers/find/{id}"),
                WorkerModel.class,
                uriVariables
        );

        return new Payment(workerModel.getName(), workerModel.getDailyIncome(), days);
    }
}
