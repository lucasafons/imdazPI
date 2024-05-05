package br.com.imdaz.imdazPI.controller;

import br.com.imdaz.imdazPI.modelo.Parceiro;
import br.com.imdaz.imdazPI.repositorio.ParceiroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parceiro")
public class ParceiroController {

    @Autowired
    private ParceiroRepositorio parceiroRepositorio;

    @GetMapping
    public List<Parceiro> listar(){
        return parceiroRepositorio.findAll();
//        Parceiro parceiro = new Parceiro(12L, "João", "Desenvolvedor", "123@gmail.com", 12345678, true, "link");
//        return parceiro;
    }

    @PostMapping
    public void incluir(@RequestBody Parceiro parceiro){
        parceiroRepositorio.save(parceiro);
    }

    @PutMapping
    public void alterar(@RequestBody Parceiro parceiro){
        parceiroRepositorio.save(parceiro);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        parceiroRepositorio.deleteById(id);
    }

}
