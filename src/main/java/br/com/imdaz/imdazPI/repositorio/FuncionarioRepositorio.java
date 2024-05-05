package br.com.imdaz.imdazPI.repositorio;

import br.com.imdaz.imdazPI.modelo.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {
}
