package com.grilo.hrworker.controller;

import com.grilo.hrworker.entity.Worker;
import com.grilo.hrworker.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {

    private final WorkerRepository repository;

    @GetMapping("/list")
    public ResponseEntity<List<Worker>> findAll(){
        var list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Worker> findAll(@PathVariable("id") long id){
        var worker = repository.findById(id);
        return worker.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }




}
