package com.vcgdev.pluginexample.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class BaseException extends Exception {
    private HttpStatus status;
    private String message;

    public BaseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.status = HttpStatus.NOT_FOUND;
    }
}
