package br.com.letscode.cliente.view;

import br.com.letscode.cliente.model.aluno.dto.AlunoResponse;
import br.com.letscode.cliente.model.casa.CasaInfo;
import lombok.Data;

@Data
public class AlunoCasaView extends AlunoResponse {
    CasaInfo casa;

    public AlunoCasaView(AlunoResponse alunoResponse, CasaInfo casaInfo) {
        this.setCasa(casaInfo);
        this.setNome(alunoResponse.getNome());
        this.setChaveCasaSeletora(alunoResponse.getChaveCasaSeletora());
        this.setSerie(alunoResponse.getSerie());
        this.setId(alunoResponse.getId());
    }
}
