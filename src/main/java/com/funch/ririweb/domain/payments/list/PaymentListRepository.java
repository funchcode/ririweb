package com.funch.ririweb.domain.payments.list;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentListRepository extends JpaRepository<PaymentList, Integer> {
    PaymentList findTopByOrderByHisListPkDesc();
}
