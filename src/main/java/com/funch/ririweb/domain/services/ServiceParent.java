package com.funch.ririweb.domain.services;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "SERVICES_PARENT_TB")
public final class ServiceParent extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parentPk;
    private String parentNm;
    private String usedGb;

    public ServiceParent(String parentNm) {
        this.parentNm = parentNm;
        /**
         * usedGb default
         */
        this.usedGb = Code.USED_Y;
    }

    public ServiceParent setUsedGb(String val) {
        this.usedGb = val;
        return this;
    }
}
