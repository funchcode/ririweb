package com.nail.ririweb.domain;

import com.nail.ririweb.domain.client.Client;
import com.nail.ririweb.domain.client.ClientRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientRepositoryTest {
    @Autowired
    ClientRepository clientRepository;

    @Test
    public void 고객_등록Test() {
        // given


        // when

        // then
    }

    @After
    public void allClean() {
        clientRepository.deleteAll();
    }
}
