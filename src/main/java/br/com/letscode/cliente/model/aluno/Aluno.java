package br.com.letscode.cliente.model.aluno;

import br.com.letscode.cliente.enumerator.Serie;
import br.com.letscode.cliente.model.aluno.dto.AlunoRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name = "aluno")
@Getter @Setter
@NoArgsConstructor
public class Aluno {
    @Id
    private String id = UUID.randomUUID().toString();
    private String nome;
    @Enumerated(EnumType.STRING)
    private Serie serie;
    @JsonProperty("house-id")
    private String chaveCasaSeletora;

    public Aluno(AlunoRequest alunoRequest) {
        this.nome = alunoRequest.getNome();
        this.serie = alunoRequest.getSerie();
    }
}
