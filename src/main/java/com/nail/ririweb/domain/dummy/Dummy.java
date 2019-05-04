package com.nail.ririweb.domain.dummy;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Setter
public class Dummy {
    @Id
    private String title;

    private String content;

    @Builder
    public Dummy(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
