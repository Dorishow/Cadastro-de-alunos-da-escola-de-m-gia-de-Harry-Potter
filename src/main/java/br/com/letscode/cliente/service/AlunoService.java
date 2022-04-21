package br.com.letscode.cliente.service;

import br.com.letscode.cliente.model.aluno.dto.AlunoRequest;
import br.com.letscode.cliente.model.aluno.dto.AlunoResponse;
import br.com.letscode.cliente.view.AlunoCasaView;

import java.util.List;

public interface AlunoService {
    List<AlunoResponse> listarAlunos();
    AlunoResponse cadastrarAluno(AlunoRequest alunoRequest);
    AlunoCasaView listarAlunoPorId(String id);
}
