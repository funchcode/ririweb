package com.funch.ririweb.domain.goods;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    Goods findTopByOrderByGoodsPkDesc();

    List<Goods> findAllByUsedGbOrderByGoodsPk(String usedGb);

    Goods findByGoodsPk(int goodsPk);
}
