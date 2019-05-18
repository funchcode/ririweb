package com.funch.ririweb.domain.client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByNameAndPhone(String name, String phone);
}
