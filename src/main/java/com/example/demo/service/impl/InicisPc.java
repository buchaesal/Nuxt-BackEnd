package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.dto.inicis.InicisRequest;
import com.example.demo.dto.inicis.InicisResponse;
import com.example.demo.service.PayHistoryService;
import com.example.demo.service.PaymentService;
import com.example.demo.service.abstracts.PayProcess;
import org.springframework.stereotype.Service;
@Service
public class InicisPc implements PaymentService {

    private void validateAuth(PayInfo payInfo) {
    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
        System.out.println("이니시스 pc : approvePay");
        return null;
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {

    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
