package com.funch.ririweb.domain.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class ServiceParentDTO {
    private String parentNm;
    private String usedGb;

    public ServiceParent toEntity() {
        return new ServiceParent(parentNm).setUsedGb(usedGb);
    }
}
