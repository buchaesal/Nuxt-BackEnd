package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.dto.kakao.KakaoRequest;
import com.example.demo.dto.kakao.KakaoResponse;
import com.example.demo.service.PayHistoryService;
import com.example.demo.service.PaymentService;
import com.example.demo.service.abstracts.PayProcess;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class KakaoPay implements PaymentService {

    private final PayProcess payProcess;

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
        System.out.println("카카오페이 : approvePay");
        return payProcess.approve(new KakaoRequest(payInfo), new KakaoResponse());
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {
        payProcess.cancel(new KakaoRequest(reqVO));
    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
