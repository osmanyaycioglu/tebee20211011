package com.training.ee.rest.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalArgumentErrorHandler implements ExceptionMapper<IllegalArgumentException> {

    @Override
    public Response toResponse(final IllegalArgumentException exceptionParam) {
        return Response.status(Status.BAD_REQUEST)
                       .header("error",
                               "test")
                       .header("Content-Type",
                               "application/json")
                       .entity(new ErrorObj().setDesc(exceptionParam.getMessage())
                                             .setErrorCause(1000))
                       .build();
    }

}
