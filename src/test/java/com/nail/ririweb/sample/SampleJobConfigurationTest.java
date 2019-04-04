package com.nail.ririweb.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleJobConfigurationTest {
    @Autowired
    private SampleJobConfiguration sample;

    @Test
    public void 잡_테스트() {
        sample.print();
    }
}
