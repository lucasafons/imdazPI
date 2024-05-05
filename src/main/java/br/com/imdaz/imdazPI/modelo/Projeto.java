package br.com.imdaz.imdazPI.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Projeto {
    @Id
    private long id;
    private String nome;
    private String descricao;
    private String linkVideo;

    public Object getId() {
        return this.id;
    }

    public Object getNome() {
        return this.nome;
    }

    public Object getDescricao() {
        return this.descricao;
    }

    public Object getLinkVideo() {
        return this.linkVideo;
    }
}
