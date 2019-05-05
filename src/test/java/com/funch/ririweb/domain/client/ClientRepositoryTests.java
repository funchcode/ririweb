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
        Client client = Client.builder().clientNo(1).phone("010-0101-1010").job("대통령").memo("VVIP 고객")
                .name("문재인").staff(1).build();
        List<Client> result;

        // when
        clientRepository.save(client);

        // then
        result = clientRepository.findAll();
        Assert.assertEquals(result.get(0).getPhone(), client.getPhone());
    }
}
