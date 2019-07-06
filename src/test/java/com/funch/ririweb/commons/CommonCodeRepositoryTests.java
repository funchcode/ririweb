package com.funch.ririweb.commons;

import com.funch.ririweb.domain.commons.CommonCode;
import com.funch.ririweb.domain.commons.CommonCodeRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommonCodeRepositoryTests {

    @Autowired
    private CommonCodeRepository commonCodeRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 공통코드_등록() {
        String codeGroup = "";
        String codeName = "USE_YN";
        String value = "N";
        CommonCode commonCode = new CommonCode(codeGroup, codeName, value);

        commonCodeRepository.save(commonCode);
        CommonCode recentData = commonCodeRepository.findTopByOrderByCodePkDesc();

        Assert.assertEquals(commonCode.getCodeNm(), recentData.getCodeNm());
    }

    @Test
    public void 공통코드_사용여부_변경() {

    }

    @After
    public void 후처리() {

    }

}
