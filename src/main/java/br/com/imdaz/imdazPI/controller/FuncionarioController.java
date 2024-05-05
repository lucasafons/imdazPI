package br.com.imdaz.imdazPI.controller;

import br.com.imdaz.imdazPI.modelo.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public FuncionarioController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public List<Map<String, Object>> getFuncionario() throws SQLException {
        return jdbcTemplate.queryForList("SELECT * FROM funcionario");
    }

    @PostMapping
    public String insertFuncionario(@RequestBody Funcionario funcionario) {
        try {
            String sql = "INSERT INTO funcionario (nome, cargo, departamento, email, telefone, voluntario, linkFoto) VALUES (?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, funcionario.getNome(), funcionario.getCargo(), funcionario.getDepartamento(),
                    funcionario.getEmail(), funcionario.getTelefone(), funcionario.getVoluntario(),
                    funcionario.getLinkFoto());
            return "Funcionário inserido com sucesso!";
        } catch (Exception e) {
            return "Erro ao inserir o funcionário: " + e.getMessage();
        }
    }
}
