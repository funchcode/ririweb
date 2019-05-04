package com.nail.ririweb.domain.common_code;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class CommonCode {
    @Id
    private Integer commonCodeNo;

    private String codeName;

    private char useYn;

    private Object createdAt;

    private Object updatedAt;
}
