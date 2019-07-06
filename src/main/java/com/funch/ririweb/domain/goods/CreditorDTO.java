package com.funch.ririweb.domain.goods;

import com.funch.ririweb.domain.commons.UseType;
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
    private String usedGb;
    private String memo;

    public Creditor toEntity() {
        return new Creditor.Builder(creditorNm).supplier(supplier).memo(memo)
                .phone(phone).useGb(usedGb).build();
    }

    public String toString() {
        return "CreditorNm : " + creditorNm + ", " +
                "Supplier : " + supplier + ", " +
                "Phone : " + phone + ", " +
                "UsedGb : " + usedGb + ", " +
                "Memo : " + memo;
    }

}
