package br.com.letscode.cliente.model.aluno.dto;

import br.com.letscode.cliente.enumerator.Serie;
import lombok.Data;

@Data
public class AlunoRequest {
    private String nome;
    private Serie serie;
}
