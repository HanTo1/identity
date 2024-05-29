package com.devteria.identity_service.exception;

import lombok.Getter;
import lombok.Setter;

public class AppException extends RuntimeException {

    public AppException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    @Getter
    @Setter
    private ErrorCode errorCode;

}
