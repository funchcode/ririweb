package com.funch.ririweb.domain.commons;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "COMMONS_CODE_TB")
@NoArgsConstructor
public final class CommonCode extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codePk;
    private String codeGb;
    private String codeNm;
    private String codeVal;
    private char usedGb;

    public CommonCode(String codeGb, String codeNm, String codeVal) {
        this.codeGb = codeGb;
        this.codeNm = codeNm;
        this.codeVal = codeVal;
        /**
         * UsedGB default
         */
        this.usedGb = 'Y';
    }

    public CommonCode setUsedGb(char val) {
        this.usedGb = usedGb;
        return this;
    }

}