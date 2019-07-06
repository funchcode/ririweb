package com.funch.ririweb.commons;

import com.funch.ririweb.domain.commons.*;
import com.funch.ririweb.service.CommonCodeService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommonCodeServiceTests {

    @Autowired
    private CommonCodeRepository commonCodeRepository;
    @Autowired
    private CommonCodeService commonCodeService;

    private CommonCodeDTO httpData;
    private CommonCode insertData;
    private CommonCode recentData;

    @Before
    public void 기본_데이터_생성() {
        String commonGroup = "TEST-GROUP";
        String commonName = "TEST-NAME";
        String commonValue = "TEST-VALUE";
        String usedYn = "";

        httpData = new CommonCodeDTO();
        httpData.setCodeGb(commonGroup);
        httpData.setCodeNm(commonName);
        httpData.setCodeVal(commonValue);
        insertData = httpData.toEntity();
    }

    @Test
    public void 공통코드_등록() {
        commonCodeService.enroll(insertData);

        recentData = commonCodeRepository.findTopByOrderByCodePkDesc();

        Assert.assertEquals(insertData.getCodeNm(), recentData.getCodeNm());
    }

    @After
    public void 등록_코드_삭제() {
        commonCodeRepository.delete(recentData);
    }

}
