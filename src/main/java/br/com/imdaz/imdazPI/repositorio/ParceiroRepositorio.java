package br.com.imdaz.imdazPI.repositorio;

import br.com.imdaz.imdazPI.modelo.Funcionario;
import br.com.imdaz.imdazPI.modelo.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParceiroRepositorio extends JpaRepository<Parceiro, Long> {
}
