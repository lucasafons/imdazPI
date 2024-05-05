package br.com.imdaz.imdazPI.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Funcionario {
    @Id
    private Long id;
    private String nome;
    private String cargo;
    private String email;
    private int telefone;
    private boolean voluntario;
    private String linkFoto;

//    public Funcionario(Long id, String nome, String cargo, String email, int telefone, boolean voluntario, String linkFoto) {
//        this.id = id;
//        this.nome = nome;
//        this.cargo = cargo;
//        this.email = email;
//        this.telefone = telefone;
//        this.voluntario = voluntario;
//        this.linkFoto = linkFoto;
    }

