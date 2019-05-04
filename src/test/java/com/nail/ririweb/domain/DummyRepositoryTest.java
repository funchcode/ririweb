package com.nail.ririweb.domain;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.nail.ririweb.domain.dummy.Dummy;
import com.nail.ririweb.domain.dummy.DummyRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyRepositoryTest {
    @Autowired
    DummyRepository dummyRepository;

    @MockBean
    private Dummy dummy;

    @After
    public void cleanup() {
        dummyRepository.deleteAll();
    }

    @Test
    public void 로컬_DB_테스트() {
        //given
        dummy = Dummy.builder()
                .title("타이틀 데이터").content("내용 데이터").build();
        //when
        dummyRepository.save(dummy);
        List<Dummy> list = dummyRepository.findAll();

        //then
        assertEquals(dummy.getTitle(), list.get(0).getTitle());
    }
}
