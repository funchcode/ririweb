package com.funch.ririweb.creditors;

import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorRepository;
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

    @Test
    public void 매입처_모두_가져오기() {
        String usedGb = "YES";
        List<Creditor> list = creditorRepository.findAllByUsedGbOrderByCreditorPkDesc(usedGb);

        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void 특정_매입처_가져오기() {
        int creditorPk = 0;
        Creditor creditor = creditorRepository.findByCreditorPk(creditorPk);

        Assert.assertEquals(creditor, null);
    }

    @After
    public void 후처리() {

    }

}
