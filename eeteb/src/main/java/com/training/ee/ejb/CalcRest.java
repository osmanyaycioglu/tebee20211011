package com.training.ee.ejb;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/calc")
public class CalcRest {

    @EJB
    private MyFirstStatelessEJB msfEjb;

    @EJB
    private MyFirstStatefullEJB statefullEJB;

    @EJB
    private MyFirstSingletonEJB singletonEJB;

    @Path("/add/stateless")
    @GET
    public String addSt(@QueryParam("v1") final Integer v1,
                        @QueryParam("v2") final Integer v2) {
        int addLoc = this.msfEjb.add(v1,
                                     v2);
        int addLoc2 = this.msfEjb.subs(v1,
                                       v2);
        int addLoc3 = this.msfEjb.add(v1,
                                      v2);
        return "Sonuç : " + addLoc;
    }

    @Path("/add/stateful")
    @GET
    public String addSl(@QueryParam("v1") final Integer v1,
                        @QueryParam("v2") final Integer v2) {
        int addLoc = this.statefullEJB.add(v1,
                                           v2);
        int addLoc2 = this.statefullEJB.subs(v1,
                                             v2);
        int addLoc3 = this.statefullEJB.add(v1,
                                            v2);
        return "Sonuç : " + addLoc;
    }

    @Path("/add/singleton")
    @GET
    public String addSg(@QueryParam("v1") final Integer v1,
                        @QueryParam("v2") final Integer v2) {
        int addLoc = this.singletonEJB.add(v1,
                                           v2);
        int addLoc2 = this.singletonEJB.subs(v1,
                                             v2);
        int addLoc3 = this.singletonEJB.add(v1,
                                            v2);
        return "Sonuç : " + addLoc;
    }

}
