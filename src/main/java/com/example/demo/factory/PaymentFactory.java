package com.example.demo.factory;

import com.example.demo.enums.PaymentType;
import com.example.demo.service.PayHistoryService;
import com.example.demo.service.PaymentService;
import com.example.demo.service.impl.InicisMo;
import com.example.demo.service.impl.InicisPc;
import com.example.demo.service.impl.KakaoPay;
import com.example.demo.service.impl.NaverPay;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

    private static Map<PaymentType, PaymentService> map;

    static {
        map = new HashMap<>();
        map.put(PaymentType.InicisMo, new InicisMo(new PayHistoryService()));
        map.put(PaymentType.InicisPc, new InicisPc());
        map.put(PaymentType.KakaoPay, new KakaoPay());
        map.put(PaymentType.NaverPay, new NaverPay());
    }

    public static PaymentService create(PaymentType paymentType){
        try {
            return map.get(paymentType);
        }catch (NullPointerException e){
            throw new IllegalArgumentException("해당하는 결제유형이 없습니다!");
        }
    }
}
