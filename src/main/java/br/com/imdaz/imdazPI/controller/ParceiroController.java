package br.com.imdaz.imdazPI.controller;

import br.com.imdaz.imdazPI.modelo.Parceiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/parceiro")
public class ParceiroController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ParceiroController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public List<Map<String, Object>> getParceiro() throws SQLException {
        return jdbcTemplate.queryForList("SELECT * FROM parceiro");
    }

    @PostMapping
    public String insertParceiro(@RequestBody Parceiro parceiro) {
        try {
            String sql = "INSERT INTO parceiro (nome, descricao, linkFoto) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, parceiro.getNome(), parceiro.getDescricao(), parceiro.getLinkFoto());
            return "Parceiro inserido com sucesso!";
        } catch (Exception e) {
            return "Erro ao inserir o parceiro: " + e.getMessage();
        }
    }
}
