package br.gov.pe.educacao.entidades;

/**
 * Created by eric.silva on 18/04/2016.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(
        name = "tb_sistema",
        schema = "public"
)
public class Sistema implements Serializable {
    @Column(
            name = "NOME"
    )
    private String nome;
    @Id
    @Column(
            name = "SIGLA"
    )

    private String sigla;

/*    @OneToMany(
            mappedBy = "sistema",
            fetch = FetchType.LAZY
    )*/

    public Sistema() {
    }

    public Sistema(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String toString() {
        return "Sistema: [nome = " + this.nome + ", sigla = " + this.sigla + "]";
    }
}