package com.funch.ririweb.service;

import com.funch.ririweb.domain.client.Client;
import com.funch.ririweb.domain.client.ClientRepository;
import com.funch.ririweb.domain.client.ClientDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ClientService {

    private ClientRepository clientRepository;

    /*고객등록*/
    @Transactional
    public void enroll(Client client) {
        Client origin = clientRepository.findByNameAndPhone(client.getName(), client.getPhone());
        if(origin == null) {
            clientRepository.save(client);
        }else {

        }
    }

    /*고객정보수정*/
    @Transactional
    public void modify(ClientDTO client) {

    }

    /*블랙리스트*/
    @Transactional
    public void blackList(ClientDTO client) {

    }
}
