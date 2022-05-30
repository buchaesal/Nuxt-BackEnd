package com.example.demo.service;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.enums.PaymentType;
import com.example.demo.sample.FunctionalInterfaceSample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PayService {

    public static void main(String[] args) {
        PayInfo payInfo = new PayInfo();
        payInfo.setOrrNo("O12345");
        payInfo.setType("kakaoPay");
        approve(payInfo);

//        PayCancelReqVO reqVO = new PayCancelReqVO();
//        reqVO.setType("inicisPc");
//        cancel(reqVO);

    }

    public static PayApproveResVO approve(PayInfo payInfo){
        PaymentType.approve(payInfo);
        return null;
    }

    public static void cancel(PayCancelReqVO reqVO){
        PaymentType.cancel(reqVO);
    }
}
