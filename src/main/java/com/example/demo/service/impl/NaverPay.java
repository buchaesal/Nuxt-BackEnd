package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class NaverPay implements PaymentService {

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
