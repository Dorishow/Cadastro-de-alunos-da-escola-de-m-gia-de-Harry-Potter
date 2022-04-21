package br.com.letscode.cliente.model.casa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class SorteioResponse {
    @JsonProperty("sorting-hat-choice")
    private String chaveSorteada;
}
