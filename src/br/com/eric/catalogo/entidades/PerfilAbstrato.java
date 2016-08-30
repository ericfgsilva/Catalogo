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
    @Column(name="incluir")
    protected boolean incluir;
    @Column(name="ler")
    protected boolean ler;
    @Column(name="alterar")
    protected boolean alterar;
    @Column(name="excluir")
    protected boolean excluir;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    protected Perfil perfil;

    public PerfilAbstrato(){
    }

    public PerfilAbstrato(String nome, String descricao, boolean incluir, boolean ler, boolean alterar, boolean excluir){
        this.nome=nome;
        this.descricao=descricao;
        this.incluir=incluir;
        this.ler=ler;
        this.alterar=alterar;
        this.excluir=excluir;
    }

    public PerfilAbstrato(String nome, String descricao, boolean incluir, boolean ler, boolean alterar, boolean excluir, Perfil perfil){
        this(nome, descricao, incluir, ler, alterar, excluir);
        this.perfil=perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isIncluir() {
        return incluir;
    }

    public void setIncluir(boolean incluir) {
        this.incluir = incluir;
    }

    public boolean isLer() {
        return ler;
    }

    public void setLer(boolean ler) {
        this.ler = ler;
    }

    public boolean isAlterar() {
        return alterar;
    }

    public void setAlterar(boolean alterar) {
        this.alterar = alterar;
    }

    public boolean isExcluir() {
        return excluir;
    }

    public void setExcluir(boolean excluir) {
        this.excluir = excluir;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void incluirPerfil(Perfil perfil){
    }

/*    public lerPerfil(String[]){
    }*/

    public void alterarPerfil(Perfil perfil){
    }

    public void excluirPerfil(Perfil perfil){
    }


    @Override
    public String toString(){
        return "Perfil: [Nome = " + this.nome + " ]";
    }
}

