package com.funch.ririweb.domains.commons;

public enum AdType {

    NAVER("NAVER"),
    INSTAGRAM("INSTAGRAM"),
    WALKING("WALKING"),
    RECOMMEND("RECOMMEND"),
    ETC("ETC");

    private String value;

    AdType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
