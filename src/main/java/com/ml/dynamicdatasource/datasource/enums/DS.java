package com.ml.dynamicdatasource.datasource.enums;

public enum DS {
    DS0("ds0"),
    DS1("ds1");

    private String name;

    DS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
