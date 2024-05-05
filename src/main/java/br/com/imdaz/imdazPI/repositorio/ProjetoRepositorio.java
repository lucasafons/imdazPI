package br.com.imdaz.imdazPI.repositorio;

import br.com.imdaz.imdazPI.modelo.Funcionario;
import br.com.imdaz.imdazPI.modelo.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepositorio extends JpaRepository<Projeto, Long> {
}
