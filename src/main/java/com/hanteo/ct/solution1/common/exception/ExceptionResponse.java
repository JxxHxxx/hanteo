package com.hanteo.ct.solution1.common.exception;

public record ExceptionResponse(
        Integer status,
        String message
) {
}
