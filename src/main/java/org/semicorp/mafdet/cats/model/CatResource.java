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
                "Maximilian", LocalDate.parse("2015-07-01"), "male", "NW1 1AA", true));
        cats.add(new Cat(UUID.fromString("c719c5c1-4f7e-4ec5-ab47-5cc38ce7a39f"),
                "Rolpf", LocalDate.parse("2015-06-01"), "male", "N15 5AB", true));
        cats.add(new Cat(UUID.fromString("a7590cc5-e02d-421b-ac0a-06c7f76bb634"),
                "Mika", LocalDate.parse("2017-01-01"),"female", "NW1 1AA", true));
        cats.add(new Cat(UUID.fromString("00d3841c-bb51-49cf-abde-909547ee2b9b"),
                "Gustap", LocalDate.parse("2012-08-01"),"male", "N21 4TA", false));
        cats.add(new Cat(UUID.fromString("2a046e78-bb2b-4f28-b1a9-e4ae4a1c2f46"),
                "Helmut", LocalDate.parse("2018-01-01"), "male", "N21 4TA", true));
        cats.add(new Cat(UUID.fromString("3afc050b-be0d-4829-81a7-0c35d0cd7ff3"),
                "Melvin", LocalDate.parse("2020-05-01"), "male", "NW1 5QA", true));

        return cats;
    }
}
