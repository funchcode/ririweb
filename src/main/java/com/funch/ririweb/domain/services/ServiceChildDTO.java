package com.funch.ririweb.domain.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class ServiceChildDTO {

    private String childNm;
    private int price;
    private String usedGb;
    private String memo;
    private int serviceParentFk;

    public ServiceChild toEntity() {
        return new ServiceChild(serviceParentFk, childNm, price).setMemo(memo).setUsedGb(usedGb);
    }

}
