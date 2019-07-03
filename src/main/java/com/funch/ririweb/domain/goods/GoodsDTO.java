package com.funch.ririweb.domain.goods;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GoodsDTO {

    private String name;
    private int purchasePrice;
    private int sellingPrice;
    private int stocks;
    private char used;
    private String memo;
    private long creditorNo;

    private Goods toEntity() {
        return new Goods(creditorNo, name, purchasePrice, sellingPrice, stocks)
                .setMemo(memo).setUsed(used);
    }

}
