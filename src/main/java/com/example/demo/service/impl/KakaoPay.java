package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.service.PaymentService;
import com.example.demo.service.abstracts.PayProcess;
import org.springframework.stereotype.Service;

@Service
public class KakaoPay implements PaymentService {



    @Override
    public void validateAuth(PayInfo payInfo) {
        System.out.println("카카오페이 인증값 검증");
    }

    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {
//        saveApproveHistory(payInfo, "kakao req str");
//        System.out.println("카카오페이 결제 승인");
//        Map<String, String> kakaoResultMap = new HashMap<>();
//        updatePayHistory(makeApproveHistoryUpdateModel(kakaoResultMap));
        return null;
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {

    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
