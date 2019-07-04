package com.funch.ririweb.domain.commons;

public enum UseType {

    ENABLED("YES"),
    DISABLED("NO");

    private String value;

    UseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
