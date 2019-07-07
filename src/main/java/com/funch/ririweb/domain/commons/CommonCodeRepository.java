package com.funch.ririweb.domain.commons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommonCodeRepository extends JpaRepository<CommonCode, Integer> {
    CommonCode findTopByOrderByCodePkDesc();

    CommonCode findByCodePk(int codePk);

    @Query("select c from CommonCode c where c.codeGb = :codeGb and c.usedGb = 'Y'")
    List<CommonCode> findAllByCodeGbOrderByCodePkAsc(@Param("codeGb") String codeGb);

    @Modifying
    @Query("update CommonCode c set c.usedGb = ?2 where c.codePk = ?1")
    int setUsedYnByCodePk(int codePk, char usedGb);
}
