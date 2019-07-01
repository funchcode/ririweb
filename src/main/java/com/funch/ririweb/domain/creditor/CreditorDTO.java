package com.funch.ririweb.domain.creditor;

import com.funch.ririweb.domain.DTOEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditorDTO implements DTOEntity {
    private String name;
    private String supplier;
    private String phone;
    private char used;
    private String memo;
}
