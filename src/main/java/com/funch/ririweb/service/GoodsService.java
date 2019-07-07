package com.funch.ririweb.service;

import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
public class GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Transactional
    public void enroll(Goods goods) {
        goodsRepository.save(goods);
    }

    @Transactional
    public List<Goods> getAllByUsed(String usedGb) {
        List<Goods> list =
                goodsRepository.findAllByUsedGbOrderByGoodsPk(usedGb);

        // TODO list null

        return list;
    }

    @Transactional
    public Goods getOneByGoodsPk(int goodsPk) {
        Goods goods = goodsRepository.findByGoodsPk(goodsPk);

        // TODO goods null

        return goods;
    }

    @Transactional
    public void update(Goods goods) {
        int goodsPk = goods.getGoodsPk();

        // TODO pk 값
        // TODO creditorPk 값 존재하는지 확인 처리

        goodsRepository.save(goods);
    }

}
