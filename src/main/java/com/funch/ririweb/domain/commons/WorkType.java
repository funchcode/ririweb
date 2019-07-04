package com.funch.ririweb.domain.commons;

public enum WorkType {

    WORK("IN"),
    RETIRE("OUT");

    private String value;

    WorkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
