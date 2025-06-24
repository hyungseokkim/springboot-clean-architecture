package com.hyungseok.clean.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * return BaseResponse.<UserDto>builder()
 *     .code(CommonResponseCode.SUCCESS.getCode())
 *     .message(CommonResponseCode.SUCCESS.getMessage())
 *     .data(userDto)
 *     .build();
 * */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {
    private String code;
    private String message;
    private T data;
}