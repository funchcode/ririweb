package com.funch.ririweb.domain.cservice;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "CSERVICE")
public final class CService extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cserviceno")
    private long cserviceNo;

    private String cname;

    private int price;

    private char used;

    private String memo;

    @Column(name = "pserviceno")
    private long pserviceNo;

    public CService(long pserviceNo, String cname, int price) {
        this.pserviceNo = pserviceNo;
        this.cname = cname;
        this.price = price;
        this.used = 'y';
    }

    public CService setUsed(char used) {
        this.used = used;
        return this;
    }

    public CService setMemo(String memo) {
        this.memo = memo;
        return this;
    }
}
