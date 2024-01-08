package com.lazydesign.enums;

public enum UserActionEnum {

    N("N","修改名称"),
    P("P","修改密码"),
    ;




    private final String code;

    private final String value;





    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }


    UserActionEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
