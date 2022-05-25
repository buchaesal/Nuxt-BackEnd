package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        TestService service = new TestService();
        service.test();
    }

}
