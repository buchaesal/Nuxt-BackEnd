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
public class InicisPc extends PayProcess<InicisRequest, InicisResponse> implements PaymentService {

    public InicisPc(PayHistoryService payHistoryService){
        super(payHistoryService);
    }

    private void validateAuth(PayInfo payInfo) {
    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
        System.out.println("이니시스 pc : approvePay");
        return super.approve(new InicisRequest(payInfo), new InicisResponse());
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {
        System.out.println("이니시스 pc : cancelPay");
    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
