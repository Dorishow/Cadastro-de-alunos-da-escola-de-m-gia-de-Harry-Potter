package br.com.letscode.cliente.controller;

import br.com.letscode.cliente.model.aluno.dto.AlunoRequest;
import br.com.letscode.cliente.model.aluno.dto.AlunoResponse;
import br.com.letscode.cliente.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoResponse> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @PostMapping
    public AlunoResponse cadastrarAluno(@RequestBody AlunoRequest alunoRequest){
        return alunoService.cadastrarAluno(alunoRequest);
    }
}
