package com.pastorin.emailservice.core.exceptions;

import com.pastorin.emailservice.application.EmailSenderService;

public class EmailServiceException extends RuntimeException{

    public EmailServiceException(String msg){
        super(msg);
    }

    public EmailServiceException(String msg, Throwable cause){
        super(msg, cause);
    }
}
