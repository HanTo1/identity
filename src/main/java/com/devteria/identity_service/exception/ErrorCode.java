package com.devteria.identity_service.exception;

import lombok.Getter;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Uncategorized error"),
    USER_EXISTED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be at least {min} characters"),
    INVALID_PASSWORD(1004, "Password must be at least {min} characters"),
    USER_NOT_EXISTED(1005, "User not existed"),
    UNAUTHENTICATED(1006, "Unauthenticated")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Getter
    private int code;
    @Getter
    private String message;

}
