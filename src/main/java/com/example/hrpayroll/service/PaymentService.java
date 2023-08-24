package com.example.hrpayroll.service;

import com.example.hrpayroll.entities.Payment;
import com.example.hrpayroll.entities.Worker;
import com.example.hrpayroll.feingclients.WorkerFeingnClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

   @Autowired
    private WorkerFeingnClient workerFeingnClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeingnClient.findById(workerId).getBody();
                return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
