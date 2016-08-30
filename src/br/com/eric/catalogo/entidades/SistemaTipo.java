package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by eric.silva on 30/08/2016.
 */
@Entity
@Table(name="tb_sistemaTipo")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class SistemaTipo implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    @Column(name="nome")
    protected String nome;
    @Column(name="descricao")
    protected String descricao;

    public SistemaTipo(){
    }

    public SistemaTipo(String nome, String descricao){
        this.nome=nome;
        this.descricao=descricao;
    }

    @Override
    public String toString(){
        return "Tipo de sistema: [Nome = " + this.nome  + " ]";
    }

}
