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

    public Perfil(String nome, String descricao, boolean permissaoIncluir, boolean permissaoLer, boolean permissaoAlterar, boolean permissaoExcluir){
        this.nome=nome;
        this.descricao=descricao;
        this.permissaoIncluir=permissaoIncluir;
        this.permissaoLer=permissaoLer;
        this.permissaoAlterar=permissaoAlterar;
        this.permissaoExcluir=permissaoExcluir;
    }
}
