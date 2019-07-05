package com.funch.ririweb.service;

import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CreditorServicesTest {

    @Autowired
    private CreditorRepository creditorRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 매입처_등록() {

    }

    @After
    public void 후처리() {

    }

}
