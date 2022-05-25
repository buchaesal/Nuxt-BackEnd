package com.example.demo.dto;

import lombok.Data;

@Data
public class PayInfo {
    private String orrNo;
    private Long payAmount;
    private String type;
}
