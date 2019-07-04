package com.funch.ririweb.domain.pservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PServiceDTO {

    private String pname;
    private char used;

    public PService toEntity() {
        return new PService(pname).setUsed(used);
    }

}
