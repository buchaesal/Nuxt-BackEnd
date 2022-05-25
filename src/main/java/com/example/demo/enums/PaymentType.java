package com.example.demo.enums;

import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.service.PaymentService;
import com.example.demo.service.impl.InicisPc;

import java.util.Arrays;
import java.util.function.Supplier;

public enum PaymentType {

    INICIS_PC("inicisPc", InicisPc::getInstance);

    private final String type;
    private final Supplier<PaymentService> service;

    PaymentType(String type, Supplier<PaymentService> service){
        this.type = type;
        this.service = service;
    }

    private static PaymentService getService(String type){
        return Arrays.stream(values())
                .filter(ele -> ele.type.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당되는 결제유형이 존재하지 않습니다."))
                .service
                .get();
    }

    public static void approve(PayInfo payInfo){
        getService(payInfo.getType()).approvePay(payInfo);
    }

    public static void cancel(PayCancelReqVO reqVO){
        getService(reqVO.getType()).cancelPay(reqVO);
    }
}
