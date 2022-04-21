package br.com.letscode.cliente.repository;

import br.com.letscode.cliente.model.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {
}
