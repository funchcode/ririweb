package com.funch.ririweb.domain.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ClientRepositoryTests {
    @Autowired
    ClientRepository clientRepository;

    @Test
    public void 고객_등록_테스트() {
        // given
        Client client = Client.builder().name("").phone("").build();
        List<Client> result;

        // when
        clientRepository.save(client);

        // then
        result = clientRepository.findAll();
        Assert.assertEquals(result.get(0).getPhone(), client.getPhone());
    }
}
