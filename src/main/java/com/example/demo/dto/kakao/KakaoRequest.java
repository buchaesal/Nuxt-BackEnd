package com.example.demo.dto.kakao;

import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayHistoryModel;
import com.example.demo.dto.PayInfo;
import com.example.demo.dto.RequestDto;
import lombok.Data;

@Data
public class KakaoRequest extends RequestDto {

    private String orderNumber;

    public KakaoRequest(PayInfo payInfo){
        this.orderNumber = payInfo.getOrrNo();
    }

    public KakaoRequest(PayCancelReqVO reqVO){
        this.orderNumber = reqVO.getOrrNo();
    }

    public PayHistoryModel getApproveSaveModel(){
        PayHistoryModel model = new PayHistoryModel();
        model.setOrrN(orderNumber);
        return model;
    }

    public PayHistoryModel getCancelSaveModel(){
        return null;
    }
}
