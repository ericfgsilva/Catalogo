package br.com.eric.catalogo.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by eric.silva on 29/08/2016.
 */
@Entity
@DiscriminatorValue(value="0")
public class Perfil extends PerfilAbstrato implements Serializable{

    public Perfil(){
    }

    public Perfil(String nome, String descricao, boolean incluir, boolean ler, boolean alterar, boolean excluir){
        this.nome=nome;
        this.descricao=descricao;
        this.incluir=incluir;
        this.ler=ler;
        this.alterar=alterar;
        this.excluir=excluir;
    }
}
