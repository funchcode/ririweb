package com.funch.ririweb.domain.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ServicesDTO {
    private long categoryNo;
    private char useYn;
    private double price;
    private String name;

    public Services toEntity() {
        return Services.builder().name(name).price(price).useYn(useYn)
                .categoryNo(categoryNo).build();
    }
}
