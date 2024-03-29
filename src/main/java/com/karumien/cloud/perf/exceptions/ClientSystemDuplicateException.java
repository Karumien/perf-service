/*
 * Copyright (c) 2019 Karumien s.r.o.
 *
 * Karumien s.r.o. is not responsible for defects arising from 
 * unauthorized changes to the source code.
 */
package com.karumien.cloud.perf.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception ClientSystem exists - {@link HttpStatus#CONFLICT} - duplicate code.
 *
 * @author <a href="miroslav.svoboda@karumien.com">Miroslav Svoboda</a>
 * @since 1.0, 10. 6. 2019 13:56:31
 */
@ResponseStatus(HttpStatus.CONFLICT)
public class ClientSystemDuplicateException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public ClientSystemDuplicateException(String code) {
        super("Client's system exists: " + code);
    }
    
}
