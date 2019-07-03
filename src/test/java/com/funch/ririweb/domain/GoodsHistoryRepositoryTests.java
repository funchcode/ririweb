package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goodshistory.GoodsHistoryRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsHistoryRepositoryTests {

    @Autowired
    private GoodsHistoryRepository goodsHistoryRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 히스토리_등록() {
        // TODO

    }

    @After
    public void 후처리() {

    }

}
