package com.funch.ririweb.domain.services;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.UseType;
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
        this.usedGb = UseType.ENABLED.getValue();
    }

    public ServiceParent setUsedGb(UseType val) {
        this.usedGb = val.getValue();
        return this;
    }
}
