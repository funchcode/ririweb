package com.funch.ririweb.domain.goods;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public final class GoodsDTO {

    private String goodsNm;
    private int purchasePrice;
    private int sellingPrice;
    private int stock;
    private String usedGb;
    private String memo;
    private int creditorFk;

    public Goods toEntity() {
        return new Goods(goodsNm, purchasePrice, sellingPrice
        , stock, memo, creditorFk).setUsedGb(usedGb);
    }
}
