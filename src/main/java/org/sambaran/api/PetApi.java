package org.sambaran.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("pet")
public class PetApi {
    @GET
    @Path("healthcheck")
    @Produces("application/json")
    public Response healthCheck() {
        return Response.ok().build();
    }
}
