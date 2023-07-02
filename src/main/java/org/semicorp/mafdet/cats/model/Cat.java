package org.semicorp.mafdet.cats.model;


import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.json.bind.annotation.JsonbProperty;
import lombok.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Schema(description = "A cat")
public class Cat {

    @Schema(required = true)
    @JsonbProperty("id")
    private UUID id;
    @Schema(required = true)
    private String name;
    @JsonbProperty("dob")
    @JsonbDateFormat("yyyy-MM-dd")
    @Schema(implementation = String.class, format = "date")
    private LocalDate dob;
    private String gender;
    private String postcode;
    private Boolean chip;

}
