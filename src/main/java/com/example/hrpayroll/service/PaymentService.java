package com.example.hrpayroll.service;

import com.example.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

import javax.swing.text.DefaultEditorKit;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
return new Payment("Bob", 200.0, days);
    }
}
