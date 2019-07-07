package com.funch.ririweb.domain.services;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "SERVICES_CHILD_TB")
public final class ServiceChild extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int childPk;
    private String childNm;
    private int price;
    private String usedGb;
    private String memo;
    private int serviceParentFk;

    public ServiceChild(int serviceParentFk, String childNm, int price) {
        this.serviceParentFk = serviceParentFk;
        this.childNm = childNm;
        this.price = price;
        /**
         * UsedGB default
         */
        this.usedGb = Code.USED_Y;
    }

    public ServiceChild setUsedGb(String val) {
        this.usedGb = val;
        return this;
    }

    public ServiceChild setMemo(String val) {
        this.memo = val;
        return this;
    }
}
