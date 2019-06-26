package com.funch.ririweb.domain.goods;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Goods extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long goodsNo;

    private String name;

    private int purchasePrice;

    private int sellingPrice;

    private int stocks;

    private String memo;

    private long creditorNo;

}
