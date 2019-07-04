package com.funch.ririweb.domains.goods;

import com.funch.ririweb.domains.commons.UseType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public final class CreditorDTO {

    private String creditorNm;
    private String supplier;
    private String phone;
    private UseType usedGb;
    private String memo;

    public Creditor toEntity() {
        return new Creditor.Builder(creditorNm).supplier(supplier).memo(memo)
                .phone(phone).useGb(usedGb).build();
    }

}
