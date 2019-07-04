package com.funch.ririweb.domain.commoncode;

import com.funch.ririweb.domains.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommonCode extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commonCodeNo;

    private String code;

    private char used;

    private long commonNo;

}
