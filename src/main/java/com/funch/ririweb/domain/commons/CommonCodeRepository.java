package com.funch.ririweb.domain.commons;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonCodeRepository extends JpaRepository<CommonCode, Integer> {
    CommonCode findTopByOrderByCodePkDesc();
}
