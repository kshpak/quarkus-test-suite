package io.quarkus.ts.http.minimum;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    private static final String TEMPLATE = "Hello, %s!";

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hello get(@QueryParam("name") @DefaultValue("World") String name) {
        return new Hello(String.format(TEMPLATE, name));
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Hello post(Hello hello) {
        return hello;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Hello put(Hello hello) {
        return hello;
    }

}