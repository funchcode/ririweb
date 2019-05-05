package com.funch.ririweb.domain.common;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonCodeRepositoryTests {
    @Autowired
    CommonCodeRepository commonCodeRepository;

    @Test
    public void 공통코드_등록_테스트() {
        // given
        CommonCode commonCode = CommonCode.builder().codeName("샘플").useYn('Y').build();
        List<CommonCode> result;

        // when
        commonCodeRepository.save(commonCode);
        result = commonCodeRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getCodeName(), commonCode.getCodeName());
    }
}
