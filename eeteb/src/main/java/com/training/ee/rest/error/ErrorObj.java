package com.training.ee.rest.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorObj {

    private List<ErrorObj> errorObjs;
    private String         desc;
    private int            errorCause;

    public void addError(final ErrorObj errorObjParam) {
        if (this.errorObjs == null) {
            this.errorObjs = new ArrayList<>();
        }
        this.errorObjs.add(errorObjParam);
    }

    public String getDesc() {
        return this.desc;
    }

    public ErrorObj setDesc(final String descParam) {
        this.desc = descParam;
        return this;
    }

    public int getErrorCause() {
        return this.errorCause;
    }

    public ErrorObj setErrorCause(final int errorCauseParam) {
        this.errorCause = errorCauseParam;
        return this;
    }

    public List<ErrorObj> getErrorObjs() {
        return this.errorObjs;
    }

    public ErrorObj setErrorObjs(final List<ErrorObj> errorObjsParam) {
        this.errorObjs = errorObjsParam;
        return this;
    }


}
