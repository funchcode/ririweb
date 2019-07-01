package com.funch.ririweb.domain;

import com.funch.ririweb.domain.creditor.Creditor;
import com.funch.ririweb.domain.creditor.CreditorRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditorRepositoryTests {

    @Autowired
    private CreditorRepository creditorRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 매입처등록() {
        // given
        Creditor creditor = new Creditor.Builder("TEST")
                .memo("Memo").phone("010-0000-0000").build();

        // when
        creditorRepository.save(creditor);
        List<Creditor> list = creditorRepository.findAll();

        // then
        Assert.assertEquals(creditor.getCreditorNo(), list.get(0).getCreditorNo());
    }

    @After
    public void 후처리() {

    }

}
