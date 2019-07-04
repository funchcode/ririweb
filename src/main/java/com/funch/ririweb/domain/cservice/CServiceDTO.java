package com.funch.ririweb.domain.cservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CServiceDTO {

    private String cname;
    private int price;
    private char used;
    private String memo;
    private long pserviceNo;

    public CService toEntity() {
        return new CService(pserviceNo, cname, price).setUsed(used).setMemo(memo);
    }

}
