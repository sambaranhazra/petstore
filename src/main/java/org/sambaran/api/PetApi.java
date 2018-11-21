package org.sambaran.api;

import org.sambaran.control.StoreRepository;
import org.sambaran.service.HealthCheckService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("pet")
public class PetApi {

    @EJB
    HealthCheckService healthCheckService;

    @Inject
    StoreRepository storeRepository;

    @GET
    @Path("health-check")
    @Produces("application/json")
    public Response healthCheck() {
        String status = healthCheckService.checkStatus();
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder().add("status", status);
        JsonObject object = objectBuilder.build();
        return Response.ok(object).build();
    }

    @GET
    @Path("items")
    @Produces("application/json")
    public Response getItemList() {
        Jsonb jsonb = JsonbBuilder.create();
        String result = jsonb.toJson(storeRepository.getAllItems());
        return Response.ok(result).build();
    }
}
