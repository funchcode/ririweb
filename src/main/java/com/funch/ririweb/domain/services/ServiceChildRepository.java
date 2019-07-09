package com.funch.ririweb.domain.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceChildRepository extends JpaRepository<ServiceChild, Integer> {
    ServiceChild findTopByOrderByChildPkDesc();

    List<ServiceChild> findAllByUsedGbOrderByChildPkDesc(String usedGb);

    ServiceChild findByChildPk(int childPk);
}
