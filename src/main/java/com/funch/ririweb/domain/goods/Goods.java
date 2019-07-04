package com.funch.ririweb.domain.goods;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "GOODS")
@NoArgsConstructor
@Getter
public class Goods extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goodsno")
    private long goodsNo;

    private String name;

    @Column(name = "purchaseprice")
    private int purchasePrice;

    @Column(name = "sellingprice")
    private int sellingPrice;

    private int stocks;

    private char used;

    private String memo;

    @Column(name = "creditorno")
    private long creditorNo;

    public Goods(long creditorNo, String name, int purchasePrice, int sellingPrice, int stocks) {
        this.creditorNo = creditorNo;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.stocks = stocks;
        this.used = 'y';
    }

    public Goods setUsed(char used) {
        this.used = used;
        return this;
    }

    public Goods setMemo(String memo) {
        this.memo = memo;
        return this;
    }

}
