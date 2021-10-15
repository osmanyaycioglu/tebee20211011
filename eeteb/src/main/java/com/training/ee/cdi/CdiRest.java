package com.training.ee.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/cdi")
@ApplicationScoped
public class CdiRest {

    @Inject
    private MyBean      myBean;

    @Inject
    @Named("osm")
    private MyBeanOther beanOther;

    @Inject
    @Named("al")
    private MyBeanOther beanOther2;

    @Inject
    @Named("vel")
    private MyBeanOther beanOther3;

    @Path("/hello")
    @GET
    public String hello() {
        this.myBean.setName("osman");
        return this.myBean.hello();
    }

    @Path("/hello2")
    @GET
    public String hello2() {
        return this.beanOther.hello();
    }

    @Path("/hello3")
    @GET
    public String hello3() {
        return this.beanOther2.hello();
    }

    @Path("/hello4")
    @GET
    public String hello4() {
        return this.beanOther3.hello();
    }

}
