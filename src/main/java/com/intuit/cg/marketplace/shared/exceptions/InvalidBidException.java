package com.intuit.cg.marketplace.shared.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidBidException extends RuntimeException {
    public InvalidBidException(String exceptionReason) {
        super(exceptionReason);
    }
}
