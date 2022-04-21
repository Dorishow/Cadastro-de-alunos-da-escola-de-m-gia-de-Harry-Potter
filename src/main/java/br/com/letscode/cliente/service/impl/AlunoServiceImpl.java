package br.com.letscode.cliente.service.impl;

import br.com.letscode.cliente.model.aluno.Aluno;
import br.com.letscode.cliente.model.aluno.dto.AlunoRequest;
import br.com.letscode.cliente.model.aluno.dto.AlunoResponse;
import br.com.letscode.cliente.model.casa.dto.SorteioResponse;
import br.com.letscode.cliente.repository.AlunoRepository;
import br.com.letscode.cliente.service.AlunoService;
import br.com.letscode.cliente.service.client.CasaInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    private final CasaInfoService casaInfoService;

    @Override
    public List<AlunoResponse> listarAlunos() {
        return AlunoResponse.toResponse(alunoRepository.findAll());
    }

    @Override
    public AlunoResponse cadastrarAluno(AlunoRequest alunoRequest) {
        Aluno aluno = new Aluno(alunoRequest);
        SorteioResponse chaveCasa = casaInfoService.sortearCasa();
        aluno.setChaveCasaSeletora(chaveCasa.getChaveSorteada());
        AlunoResponse alunoResponse = new AlunoResponse(alunoRepository.save(aluno));
        return alunoResponse;
    }
}
