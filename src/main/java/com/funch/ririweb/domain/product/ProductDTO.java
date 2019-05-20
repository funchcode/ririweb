package com.funch.ririweb.domain.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {

    private String name, state, memo, company;

    private double inPrice, salePrice;

    private int stock;

    public Product toEntity() {
        return Product.builder().name(name).state(state).memo(memo).company(company)
                .inPrice(inPrice).salePrice(salePrice).stock(stock).build();
    }

}
