package com.fwy.quzuche;

import com.fwy.quzuche.utils.SumUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuzucheApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void SumTest(){
        System.out.println(SumUtils.Sum(1000, 100));
    }

}
