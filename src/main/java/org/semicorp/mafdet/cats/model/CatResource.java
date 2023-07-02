package org.semicorp.mafdet.cats.model;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.semicorp.mafdet.cats.number.NumberProxy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Path("/api/cats")
@Tag(name = "Cat REST Endpoint")
public class CatResource {

    @RestClient
    NumberProxy numberProxy;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cat> hello() {
        log.info("Get all cat resources");

        return generateListOfCats();
    }


    public static List<Cat> generateListOfCats(){
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(UUID.fromString("96ccfa6d-180a-4df4-927a-062b3e184ed0"),
                "Mortimer",
                LocalDate.parse("2015-07-01"),
                "male"));
        cats.add(new Cat(UUID.fromString("c719c5c1-4f7e-4ec5-ab47-5cc38ce7a39f"),
                "Rambotron",
                LocalDate.parse("2015-06-01"),
                "male"));

        return cats;
    }
}
