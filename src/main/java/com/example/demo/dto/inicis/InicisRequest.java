package com.example.demo.dto.inicis;

import com.example.demo.dto.PayCancelReqVO;
import com.example.demo.dto.PayHistoryModel;
import com.example.demo.dto.PayInfo;
import com.example.demo.dto.RequestDto;
import lombok.Data;

@Data
public class InicisRequest extends RequestDto {

    private String oid;
    private String tid;

    public InicisRequest(PayInfo payInfo){
        this.oid = payInfo.getOrrNo();
    }

    public InicisRequest(PayCancelReqVO reqVO){
        this.oid = reqVO.getOrrNo();
    }

    @Override
    public PayHistoryModel getApproveSaveModel(){
        PayHistoryModel model = new PayHistoryModel();
        model.setOrrN(oid);
        return model;
    }

    @Override
    public PayHistoryModel getCancelSaveModel(){
        PayHistoryModel model = new PayHistoryModel();
        model.setTrstId(tid);
        return model;
    }

}
