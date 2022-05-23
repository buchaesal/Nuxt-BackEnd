package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.service.PayHistoryService;
import com.example.demo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InicisPc implements PaymentService {

    @Autowired
    private PayHistoryService payHistoryService;

    @Override
    public void validateAuth(PayInfo payInfo) {

    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {

        return null;
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {

    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
