package com.funch.ririweb.domain.goods;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Table(name = "GOODS_TB")
@Entity
public final class Goods extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goodsPk;
    private String goodsNm;
    private int purchasePrice;
    private int sellingPrice;
    private int stock;
    private String usedGb;
    private String memo;
    private int creditorFk;

    public Goods(String goodsNm, int purchasePrice, int sellingPrice, int stock, String memo, int creditorFk) {
        this.goodsNm = goodsNm;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.memo = memo;
        this.creditorFk = creditorFk;
        /**
         * usedGb
         */
        this.usedGb = Code.USED_Y;
    }

    public Goods setUsedGb(String usedGb) {
        this.usedGb = usedGb;
        return this;
    }
}
