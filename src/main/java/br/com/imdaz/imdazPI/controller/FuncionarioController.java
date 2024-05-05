package br.com.imdaz.imdazPI.controller;

import br.com.imdaz.imdazPI.modelo.Funcionario;
import br.com.imdaz.imdazPI.repositorio.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;

    @GetMapping
    public List<Funcionario> listar(){
        return funcionarioRepositorio.findAll();
//        Funcionario funcionario = new Funcionario(12L, "João", "Desenvolvedor", "123@gmail.com", 12345678, true, "link");
//        return funcionario;
    }

    @PostMapping
    public void incluir(@RequestBody Funcionario funcionario){
        funcionarioRepositorio.save(funcionario);
    }

    @PutMapping
    public void alterar(@RequestBody Funcionario funcionario){
        funcionarioRepositorio.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        funcionarioRepositorio.deleteById(id);
    }

}
