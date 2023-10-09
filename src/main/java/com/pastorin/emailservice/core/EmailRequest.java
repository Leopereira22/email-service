package com.pastorin.emailservice.core;

import lombok.Data;


public record EmailRequest(String to, String subject, String body) {
}
