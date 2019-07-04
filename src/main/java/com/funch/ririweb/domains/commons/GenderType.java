package com.funch.ririweb.domains.commons;

public enum GenderType {

    WOMAN("woman"),
    MAN("man");

    private String value;

    GenderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
