package com.dayone.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Builder
public class ErrorResponse {
    private int code;
    private String message;
}
