package br.gov.pe.educacao.br.gov.pe.educacao.entidades;

/**
 * Created by eric.silva on 18/04/2016.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(
        name = "tb_cliente",
        schema = "public"
)
public class Sistema implements Serializable {
    @Column(
            name = "NOME"
    )
    private String nome;
    @Id
    @Column(
            name = "CPF"
    )
    private String cpf;
    @OneToMany(
            mappedBy = "cliente",
            fetch = FetchType.LAZY
    )
    private List<ContaAbstrata> contas;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ContaAbstrata> getContas() {
        return this.contas;
    }

    public void setContas(List<ContaAbstrata> contas) {
        this.contas = contas;
    }

    public String toString() {
        return "Cliente: [nome = " + this.nome + ", cpf = " + this.cpf + "]";
    }
}
