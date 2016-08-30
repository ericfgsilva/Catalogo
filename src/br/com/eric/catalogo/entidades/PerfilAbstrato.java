package br.com.eric.catalogo.entidades;

import com.sun.jna.platform.win32.LMAccess;
import com.sun.jna.platform.win32.Netapi32Util;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Array;

/**
 * Created by efgs on 28/08/16.
 */
@Entity
@Table(name="td_perfil")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class PerfilAbstrato implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    @Column(name="nome")
    protected String nome;
    @Column(name="descricao")
    protected String descricao;
    @Column(name="permissaoIncluir")
    protected boolean permissaoIncluir;
    @Column(name="permissaoLer")
    protected boolean permissaoLer;
    @Column(name="permissaoAlterar")
    protected boolean permissaoAlterar;
    @Column(name="permissaoExcluir")
    protected boolean permissaoExcluir;

    public PerfilAbstrato(){
    }

    public PerfilAbstrato(String nome, String descricao, boolean permissaoIncluir, boolean permissaoLer, boolean permissaoAlterar, boolean permissaoExcluir){
        this.nome=nome;
        this.descricao=descricao;
        this.permissaoIncluir=permissaoIncluir;
        this.permissaoLer=permissaoLer;
        this.permissaoAlterar=permissaoAlterar;
        this.permissaoExcluir=permissaoExcluir;
    }

    @Override
    public String toString(){
        return "Perfil: [Nome = " + this.nome + " ]";
    }
}

