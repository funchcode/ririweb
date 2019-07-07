package com.funch.ririweb.service;


import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CreditorService {

    @Autowired
    private CreditorRepository creditorRepository;

    @Transactional
    public void enroll(Creditor creditor) {
        creditorRepository.save(creditor);
    }

    @Transactional
    public List<Creditor> getAllByUsed(String usedGb) {
        List<Creditor> list =
                creditorRepository.findAllByUsedGbOrderByCreditorPkDesc(usedGb);

        // TODO null 값 처리

        return list;
    }

    @Transactional
    public Creditor getOneByCreditorPk(int creditorPk) {
        Creditor creditor = creditorRepository.findByCreditorPk(creditorPk);

        // TODO null 값 처리

        return creditor;
    }

    @Transactional
    public void update(Creditor creditor) {
        int originPk = creditor.getCreditorPk();

        // TODO pk 값 처리

        creditorRepository.save(creditor);
    }
}
