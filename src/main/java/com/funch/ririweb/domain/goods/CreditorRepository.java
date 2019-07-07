package com.funch.ririweb.domain.goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreditorRepository extends JpaRepository<Creditor, Integer> {
    Creditor findTopByOrderByCreditorPkDesc();

    List<Creditor> findAllByUsedGbOrderByCreditorPkDesc(String usedGb);

    Creditor findByCreditorPk(int creditorPk);
}
