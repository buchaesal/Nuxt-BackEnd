package com.example.demo.service.abstracts;

import com.example.demo.dto.PayApproveResVO;
import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.service.PayHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class PayProcess {

    private final PayHistoryService payHistoryService;

    public <T extends RequestDto, T2 extends ResponseDto> PayApproveResVO approve(T request, T2 response){

        // 이력 insert
        payHistoryService.saveApproveHistory(request.getApproveSaveModel());

        // api 호출
        System.out.println("결제 승인 api 호출");
//        String apiResult =  "{ \"tid\" : \"t11111\" }";
        String apiResult =  "{ \"kakaoTrstId\" : \"t11111\" }";

        // 이력 update
        payHistoryService.updateApproveHistory(response.parseResult(apiResult).getApproveUpdateModel());

        return null;
    }

    public <T extends  RequestDto> void cancel(T request){

        // 취소 이력 insert
        payHistoryService.saveCancelHistory(request.getCancelSaveModel());

        // api 호출
        System.out.println("결제 취소 api");
    }

}
