package com.example.demo;

import com.example.demo.dto.PayInfo;
import com.example.demo.service.PayService;
import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        PayInfo payInfo = new PayInfo();
        payInfo.setOrrNo("O12345");
        payInfo.setType("kakaoPay");
        PayService.approve(payInfo);
    }

}
