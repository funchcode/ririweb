package com.funch.ririweb.domain.commons;

public enum GenderType {

    WOMAN("WOMAN"),
    MAN("MAN");

    private String value;

    GenderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
