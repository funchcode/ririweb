package com.funch.ririweb.domain.commons;

public enum PartType {

    EYELASHES("EYELASHES"),
    NAIL("NAIL");

    private String value;

    PartType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
