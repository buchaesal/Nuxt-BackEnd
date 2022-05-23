package com.example.demo.dto;

import com.example.demo.enums.PaymentType;
import lombok.Data;

@Data
public class PayInfo {
    private String orrNo;
    private Long payAmount;
    private PaymentType paymentType;
}
