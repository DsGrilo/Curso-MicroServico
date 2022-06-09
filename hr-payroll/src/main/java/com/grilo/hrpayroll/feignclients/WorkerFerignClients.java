package com.grilo.hrpayroll.feignclients;

import com.grilo.hrpayroll.entity.WorkerModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFerignClients {

    @GetMapping(value = "/find/{id}")
    ResponseEntity<WorkerModel> findById(@PathVariable Long id);
}
