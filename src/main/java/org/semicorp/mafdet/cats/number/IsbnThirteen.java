package org.semicorp.mafdet.cats.number;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;

@Getter
public class IsbnThirteen {
    @JsonbProperty("isbn_13")
    public String isbn13;
}
