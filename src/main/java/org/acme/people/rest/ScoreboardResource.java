package org.acme.people.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.vertx.core.json.JsonObject;

@Path("/api/scoreboard")
public class ScoreboardResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String recordScore(String score) {

        JsonObject obj = new JsonObject(score);
        String name = obj.getString("name");

        return "recorded score for " + name;
    }
}