package com.funch.ririweb.domain.services;

import com.funch.ririweb.domain.commons.UseType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class ServiceParentDTO {
    private String parentNm;
    private UseType usedGb;

    public ServiceParent toEntity() {
        return new ServiceParent(parentNm).setUsedGb(usedGb);
    }
}
