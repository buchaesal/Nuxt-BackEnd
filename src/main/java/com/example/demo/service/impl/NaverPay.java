package com.example.demo.service.impl;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayInfo;
import com.example.demo.dto.inicis.InicisResponse;
import com.example.demo.dto.kakao.KakaoRequest;
import com.example.demo.dto.kakao.KakaoResponse;
import com.example.demo.dto.naver.NaverRequest;
import com.example.demo.dto.naver.NaverResponse;
import com.example.demo.service.PayHistoryService;
import com.example.demo.service.PaymentService;
import com.example.demo.service.abstracts.PayProcess;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class NaverPay  implements PaymentService {


    @Override
    public PayApproveResVO approvePay(PayInfo payInfo) {

        // 전문 setting
        NaverRequest request = new NaverRequest();
        request.setNaverOrderNumber(payInfo.getOrrNo());

        // api 통신
        String apiResult =  "{ \"naverTrstId\" : \"t11111\" }";

        try{
            // 응답 수신
            NaverResponse response = new ObjectMapper().readValue(apiResult, NaverResponse.class);
        }catch (JsonProcessingException e){

        }

        return null;
    }

    @Override
    public void cancelPay(PayCancelReqVO reqVO) {

    }

    @Override
    public void netCancel(PayInfo payInfo) {

    }
}
