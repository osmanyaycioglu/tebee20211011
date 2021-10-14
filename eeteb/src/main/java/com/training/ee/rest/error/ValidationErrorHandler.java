package com.training.ee.rest.error;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationErrorHandler implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(final ConstraintViolationException exceptionParam) {
        ErrorObj rootErrorLoc = new ErrorObj().setDesc("Validation error")
                                              .setErrorCause(2000);
        Set<ConstraintViolation<?>> constraintViolationsLoc = exceptionParam.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolationLoc : constraintViolationsLoc) {
            rootErrorLoc.addError(new ErrorObj().setDesc(constraintViolationLoc.toString())
                                                .setErrorCause(2001));
        }
        return Response.status(Status.BAD_REQUEST)
                       .header("error",
                               "validation")
                       .header("Content-Type",
                               "application/json")
                       .entity(rootErrorLoc)
                       .build();
    }

}
