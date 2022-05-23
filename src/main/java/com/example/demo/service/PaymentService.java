package com.example.demo.service;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;

public interface PaymentService {
    void validateAuth(PayInfo payInfo);
    PayApproveResVO approvePay(PayInfo payInfo);
    void cancelPay(PayCancelReqVO reqVO);
    void netCancel(PayInfo payInfo);
}
