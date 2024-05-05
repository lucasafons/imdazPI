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
    private String departamento;
    private String email;
    private int telefone;
    private boolean voluntario;
    private String linkFoto;

    public Object getNome() {
        return this.nome;
    }

    public Object getCargo() {
        return this.cargo;
    }

    public Object getDepartamento() {
        return this.departamento;
    }

    public Object getEmail() {
        return this.email;
    }

    public Object getTelefone() {
        return this.telefone;
    }

    public Object getVoluntario() {
        return this.voluntario;
    }

    public Object getLinkFoto() {
        return this.linkFoto;
    }

    public Object getId() {
        return this.id;
    }
}

