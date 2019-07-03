package com.funch.ririweb.domain.creditor;

import com.funch.ririweb.domain.DTOEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreditorDTO implements DTOEntity {

    private String name;
    private String supplier;
    private String phone;
    private char used;
    private String memo;

    public Creditor toEntity() {
        return new Creditor.Builder(name)
                .supplier(supplier).phone(phone).used(used).memo(memo).build();
    }

}
