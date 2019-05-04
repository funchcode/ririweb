package com.nail.ririweb.domain.client;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clientNo;

    private String name;

    private Object birthday;

    private String phone;

    private String staff;

    private String email;

    private String memo;

    private char gender;

    private String job;

    private Object createdAt;

    private Object updatedAt;
}
