package com.sentry.sentry.exceptions;

import com.sentry.sentry.utils.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
        super(MessageUtils.NOT_FOUND_MESSAGE);
    }
}
