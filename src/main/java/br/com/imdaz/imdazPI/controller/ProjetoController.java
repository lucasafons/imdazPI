package br.com.imdaz.imdazPI.controller;

import br.com.imdaz.imdazPI.modelo.Projeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProjetoController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public List<Map<String, Object>> getProjeto() throws SQLException {
        return jdbcTemplate.queryForList("SELECT * FROM projeto");
    }

    @PostMapping
    public String insertProjeto(@RequestBody Projeto projeto) {
        try {
            String sql = "INSERT INTO projeto (nome, descricao, linkVideo) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, projeto.getNome(), projeto.getDescricao(), projeto.getLinkVideo());
            return "Projeto inserido com sucesso!";
        } catch (Exception e) {
            return "Erro ao inserir o projeto: " + e.getMessage();
        }
    }
}
