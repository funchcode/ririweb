package com.funch.ririweb.domain.pservice;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "PSERVICE")
public final class PService extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pserviceno")
    private long pserviceNo;

    private String pname;

    private char used;

    public PService(String pname) {
        this.pname = pname;
        this.used = 'y';
    }

    PService setUsed(char used) {
        this.used = used;
        return this;
    }

}
