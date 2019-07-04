package com.funch.ririweb.domain.commons;

public enum StatusType {

    STANDBY("STANDBY"),
    CANCEL("CANCEL"),
    COMPLETE("COMPLETE");

    private String value;

    StatusType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
