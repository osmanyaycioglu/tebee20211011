package com.training.ee.rest.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericErrorHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(final Exception exceptionParam) {
        return Response.status(Status.INTERNAL_SERVER_ERROR)
                       .header("error",
                               "internal")
                       .header("Content-Type",
                               "application/json")
                       .entity(new ErrorObj().setDesc(exceptionParam.getMessage())
                                             .setErrorCause(5005))
                       .build();
    }

}
