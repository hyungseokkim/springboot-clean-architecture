package com.hyungseok.clean.common.constants;

import lombok.Getter;

@Getter
public enum CommonResponseCode {
    SUCCESS("200", "성공"),
    FAIL("500", "실패");

    private final String code;
    private final String message;

    CommonResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
