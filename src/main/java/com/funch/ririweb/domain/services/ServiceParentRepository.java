package com.funch.ririweb.domain.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceParentRepository extends JpaRepository<ServiceParent, Integer> {
    ServiceParent findTopByOrderByParentPkDesc();

    List<ServiceParent> findAllByUsedGbOrderByParentPkDesc(String usedGb);

    ServiceParent findByParentPk(int parentPk);
}