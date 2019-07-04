package com.funch.ririweb.domains.goods;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    Goods findTopByOrderByGoodPkDesc();
}
