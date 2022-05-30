package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.dto.kakao.KakaoRequest;
import com.example.demo.dto.kakao.KakaoResponse;
import com.example.demo.service.PayHistoryService;
import com.example.demo.service.PaymentService;
import com.example.demo.service.abstracts.PayProcess;
import org.springframework.stereotype.Service;

@Service
public class KakaoPay extends PayProcess<KakaoRequest, KakaoResponse> implements PaymentService {

    public KakaoPay(PayHistoryService payHistoryService) {
        super(payHistoryService);
    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
        System.out.println("카카오페이 : approvePay");
        return super.approve(new KakaoRequest(payInfo), new KakaoResponse());
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {
        super.cancel(new KakaoRequest(reqVO));
    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
