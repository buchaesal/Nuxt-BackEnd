package com.example.demo.service;

import com.example.demo.dto.PayHistoryModel;
import org.springframework.stereotype.Service;

@Service
public class PayHistoryService {
    public void saveApproveHistory(PayHistoryModel model){
        System.out.println("승인 이력 insert : " + model.toString());
    }

    public void updateApproveHistory(PayHistoryModel model){
        System.out.println("승인 이력 update : " + model.toString());
    }

    public void saveCancelHistory(PayHistoryModel model) {
        System.out.println("취소 이력 insert : " + model.toString());
    }
}
