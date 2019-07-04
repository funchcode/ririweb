package com.funch.ririweb.domains.goods;

import com.funch.ririweb.domains.BaseTimeEntity;
import com.funch.ririweb.domains.commons.UseType;
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
    private int goodPk;
    private String goodNm;
    private int purchasePrice;
    private int sellingPrice;
    private int stock;
    private String usedGb;
    private String memo;
    private int creditorFk;

    public Goods(String goodNm, int purchasePrice, int sellingPrice, int stock, String memo, int creditorFk) {
        this.goodNm = goodNm;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.memo = memo;
        this.creditorFk = creditorFk;
        /**
         * usedGb
         */
        this.usedGb = UseType.ENABLED.getValue();
    }

    public Goods setUsedGb(UseType usedGb) {
        this.usedGb = usedGb.getValue();
        return this;
    }
}
