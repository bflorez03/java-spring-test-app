package com.tempe.test;

import com.tempe.test.controller.PriceController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    private PriceController priceController;

    @Test
    void contextLoads() {
    }

}
