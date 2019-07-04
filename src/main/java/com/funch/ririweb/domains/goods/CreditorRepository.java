package com.funch.ririweb.domains.goods;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditorRepository extends JpaRepository<Creditor, Integer> {
    Creditor findTopByOrderByCreditorPkDesc();
}
