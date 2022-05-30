package com.example.demo.dto.kakao;

import com.example.demo.dto.PayHistoryModel;
import com.example.demo.dto.ResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class KakaoResponse extends ResponseDto {

    private String kakaoTrstId;

    public PayHistoryModel getApproveUpdateModel(){
        PayHistoryModel model = new PayHistoryModel();
        model.setTrstId(kakaoTrstId);
        return model;
    }

    public ResponseDto parseResult(String resultJson){
        try{
            return new ObjectMapper().readValue(resultJson, KakaoResponse.class);
        }catch (JsonProcessingException e){
        }
        return null;
    }
}
