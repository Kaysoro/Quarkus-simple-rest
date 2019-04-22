package com.github.kaysoro.resource;

import com.github.kaysoro.entity.Card;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("cards")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class CardResource {

    @GET
    public List<Card> get() {
        return Card.listAll(Sort.by("name"));
    }
}