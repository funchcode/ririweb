package com.funch.ririweb.service;


import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorDTO;
import com.funch.ririweb.domain.goods.CreditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class CreditorService {

    @Autowired
    private CreditorRepository creditorRepository;

    // TODO 매입처 등록
    @Transactional
    public void enroll(Creditor creditor) {
        creditorRepository.save(creditor);
    }

    // TODO 모든 매입처 가져오기
    @Transactional
    public void getAll(CreditorDTO creditor) {

    }
    // TODO 하나의 매입처 가져오기
    @Transactional
    public void getOne() {

    }

    // TODO 매입처 정보 수정
    public void update() {

    }
}
