package com.funch.ririweb.domain.commons;

public enum ReceiptType {

    YES("YES"),
    NO("NO");

    private String value;

    ReceiptType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
