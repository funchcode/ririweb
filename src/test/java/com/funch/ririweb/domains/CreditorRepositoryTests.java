package com.funch.ririweb.domains;

import com.funch.ririweb.domains.goods.Creditor;
import com.funch.ririweb.domains.goods.CreditorRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditorRepositoryTests {

    @Autowired
    private CreditorRepository creditorRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 매입처_등록() {
        // TODO given
        Creditor creditor = new Creditor.Builder("VERY GOOD NAIL")
                .supplier("김모씨").phone("010-0000-0000").memo("저렴하다.").build();

        // TODO when
        creditorRepository.save(creditor);
        Creditor recentData = creditorRepository.findTopByOrderByCreditorPkDesc();

        // TODO then
        Assert.assertEquals(creditor.getCreditorNm(), recentData.getCreditorNm());
    }

    @After
    public void 후처리() {

    }

}
