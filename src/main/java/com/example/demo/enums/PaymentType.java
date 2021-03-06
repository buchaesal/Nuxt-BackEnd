package com.example.demo.enums;

import com.example.demo.config.SpringContext;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.service.PaymentService;
import com.example.demo.service.impl.KakaoPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Supplier;

public enum PaymentType {

//    INICIS_PC("inicisPc", new InicisPc(new PayHistoryService())),
    KAKAO_PAY("kakaoPay", SpringContext.getBean(KakaoPay.class));

    private final String type;
    private final PaymentService service;

    PaymentType(String type, PaymentService service){
        this.type = type;
        this.service = service;
    }

    private static PaymentService getService(String type){
        return Arrays.stream(values())
                .filter(ele -> ele.type.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당되는 결제유형이 존재하지 않습니다."))
                .service;
    }

    public static void approve(PayInfo payInfo){
        getService(payInfo.getType()).approvePay(payInfo);
    }

    public static void cancel(PayCancelReqVO reqVO){
        getService(reqVO.getType()).cancelPay(reqVO);
    }
}
