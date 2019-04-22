package com.github.kaysoro.resource;

import com.github.kaysoro.entity.Deck;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("decks")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class DeckResource {

    @GET
    public List<Deck> get() {
        return Deck.listAll(Sort.by("name"));
    }
}