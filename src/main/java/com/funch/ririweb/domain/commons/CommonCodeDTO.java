package com.funch.ririweb.domain.commons;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class CommonCodeDTO {

    private String codeGb;
    private String codeNm;
    private String codeVal;
    private char usedGb;

    public CommonCode toEntity() {
        return new CommonCode(codeGb, codeNm, codeVal).setUsedGb(usedGb);
    }

}
