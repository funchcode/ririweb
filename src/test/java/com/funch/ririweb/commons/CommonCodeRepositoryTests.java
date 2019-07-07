package com.funch.ririweb.commons;

import com.funch.ririweb.domain.commons.CommonCode;
import com.funch.ririweb.domain.commons.CommonCodeRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
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
    public void 그룹명_가져오기() {
        String codeGroup = "AD";
        List<CommonCode> list = commonCodeRepository.findAllByCodeGbOrderByCodePkAsc(codeGroup);
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void 공통코드_가져오기() {
        int codePk = 15;
        CommonCode code = commonCodeRepository.findByCodePk(codePk);
        Assert.assertEquals(code.getCodePk(), codePk);
    }

    @After
    public void 후처리() {

    }

}
