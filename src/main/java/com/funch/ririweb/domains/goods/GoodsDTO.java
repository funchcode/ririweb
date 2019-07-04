package com.funch.ririweb.domains.goods;

import com.funch.ririweb.domains.commons.UseType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public final class GoodsDTO {

    private String goodNm;
    private int purchasePrice;
    private int sellingPrice;
    private int stock;
    private UseType usedGb;
    private String memo;
    private int creditorFk;

    public Goods toEntity() {
        return new Goods(goodNm, purchasePrice, sellingPrice
        , stock, memo, creditorFk).setUsedGb(usedGb);
    }

}
