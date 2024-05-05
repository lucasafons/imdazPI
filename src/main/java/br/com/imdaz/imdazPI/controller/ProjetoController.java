package br.com.imdaz.imdazPI.controller;

import br.com.imdaz.imdazPI.modelo.Projeto;
import br.com.imdaz.imdazPI.repositorio.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoRepositorio projetoRepositorio;

    @GetMapping
    public List<Projeto> listar(){
        return projetoRepositorio.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Projeto projeto){
        projetoRepositorio.save(projeto);
    }

    @PutMapping
    public void alterar(@RequestBody Projeto projeto){
        projetoRepositorio.save(projeto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        projetoRepositorio.deleteById(id);
    }

}
