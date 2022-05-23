package com.example.demo.service;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.enums.PaymentType;
import com.example.demo.factory.PaymentFactory;

public class PayService {

    public static void main(String[] args) {
        PayInfo payInfo = new PayInfo();
        payInfo.setOrrNo("O12345");
        payInfo.setPaymentType(PaymentType.InicisMo);
        approve(payInfo);
    }

    public static PayApproveResVO approve(PayInfo payInfo){

        PaymentService paymentService = PaymentFactory.create(payInfo.getPaymentType());

        paymentService.validateAuth(payInfo);
        paymentService.approvePay(payInfo);

        return null;
    }
}
