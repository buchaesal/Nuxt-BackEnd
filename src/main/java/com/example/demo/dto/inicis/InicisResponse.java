package com.example.demo.dto.inicis;

import com.example.demo.dto.PayHistoryModel;
import com.example.demo.dto.ResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class InicisResponse extends ResponseDto {

    private String tid;

    @Override
    public PayHistoryModel getApproveUpdateModel(){
        PayHistoryModel model = new PayHistoryModel();
        model.setTrstId(tid);
        return model;
    }

    @Override
    public ResponseDto parseResult(String resultJson){
        try{
            return new ObjectMapper().readValue(resultJson, InicisResponse.class);
        }catch (JsonProcessingException e){
        }
        return null;
    }
}
