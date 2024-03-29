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
 * Exception when no ClientSystem exists - {@link HttpStatus#SC_NOT_FOUND}.
 *
 * @author <a href="miroslav.svoboda@karumien.com">Miroslav Svoboda</a>
 * @since 1.0, 10. 6. 2019 13:56:31
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClientSystemNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public ClientSystemNotFoundException(String code) {
        super("Client's system not found: " + code);
    }
    
}
