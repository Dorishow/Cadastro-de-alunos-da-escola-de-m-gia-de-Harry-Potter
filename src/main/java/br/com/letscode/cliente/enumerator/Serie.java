package br.com.letscode.cliente.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Serie {
    PRIMEIRA("Primeira série"), SEGUNDA("Segunda série"), TERCEIRA("Terceira série");
    private String label;
}
