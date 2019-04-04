package com.nail.ririweb.repository;

import com.nail.ririweb.dao.Dummy;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyRepositoryTest {
//    @Autowired
//    DummyRepository dummyRepository;
//
//    @MockBean
//    private Dummy dummy;

    @After
    public void cleanup() {
//        dummyRepository.deleteAll();
//        dummy = new Dummy("title1", "content1");
//        dummyRepository.save(dummy);
    }

    @Test
    public void addContent() {
    }
}
