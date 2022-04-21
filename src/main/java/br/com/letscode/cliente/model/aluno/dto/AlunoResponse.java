package br.com.letscode.cliente.model.aluno.dto;

import br.com.letscode.cliente.model.aluno.Aluno;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter @Setter
public class AlunoResponse extends AlunoRequest {
    private String id;
    @JsonProperty("house-id")
    private String chaveCasaSeletora;

    public AlunoResponse(Aluno aluno) {
        this.setId(aluno.getId());
        this.setChaveCasaSeletora(aluno.getChaveCasaSeletora());
        this.setNome(aluno.getNome());
        this.setSerie(aluno.getSerie());
    }

    public static List<AlunoResponse> toResponse(List<Aluno> alunos){
        return alunos.stream().map(AlunoResponse::new).collect(Collectors.toList());
    }
}
