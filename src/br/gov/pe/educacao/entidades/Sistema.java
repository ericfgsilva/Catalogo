package br.gov.pe.educacao.entidades;

/**
 * Created by eric.silva on 18/04/2016.
 */
import java.io.Serializable;
import javax.persistence.*;

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

    @Column(
            name = "SIGLA"
    )
    private String sigla;

    @Id
    @GeneratedValue
    @Column(
           name = "CODIGO"
    )
    private Long codigo;

   /* @OneToMany(
            mappedBy = "sistema",
            fetch = FetchType.LAZY
    )*/

    public Sistema() {
    }

    public Sistema(String nome, String sigla, Long codigo) {
        this.nome = nome;
        this.sigla = sigla;
        this.codigo = codigo;
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

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Sistema: [nome = " + this.nome + ", sigla = " + this.sigla + ", codigo = " + this.codigo + "]";
    }
}