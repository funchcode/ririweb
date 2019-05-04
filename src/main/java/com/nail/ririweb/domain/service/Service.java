package com.nail.ririweb.domain.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Service {
    @Id
    private Integer serviceNo;

    private String name;

    private char useYn;

    private Object createdAt;

    private Object updatedAt;
}
