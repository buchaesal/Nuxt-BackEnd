package com.example.demo.service.abstracts;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.service.PayHistoryService;

public abstract class PayProcess<T extends RequestDto, T2 extends ResponseDto> {

    private PayHistoryService payHistoryService;

    public PayProcess(PayHistoryService payHistoryService){
        this.payHistoryService = payHistoryService;
    }

    public PayApproveResVO approve(T request, T2 response){

        // 이력 insert
        payHistoryService.saveApproveHistory(request.getApproveSaveModel());

        // api 호출
        System.out.println("결제 승인 api 호출");
        String apiResult =  "{ \"tid\" : \"t11111\" }";

        // 이력 update
        payHistoryService.updateApproveHistory(response.parseResult(apiResult).getApproveUpdateModel());

        return null;
    }

    public void cancel(T request){

        // 취소 이력 insert
        payHistoryService.saveCancelHistory(request.getCancelSaveModel());

        // api 호출
        System.out.println("결제 취소 api");
    }

}
