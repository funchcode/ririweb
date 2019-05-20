package com.funch.ririweb.domain.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO {

    private String name;

    private char useYn;

    public Category toEntity() {
        return Category.builder().name(name).useYn(useYn).build();
    }
}
