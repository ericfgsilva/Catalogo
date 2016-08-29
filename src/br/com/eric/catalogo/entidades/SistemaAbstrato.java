package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */
@Entity
@Table(name="td_sistema")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo", discriminatorType=DiscriminatorType.INTEGER)
public abstract class SistemaAbstrato implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    @Column(name="sigla")
    protected String sigla;
    @Column(name="nome")
    protected String nome;
    @Column(name="ano")
    protected int ano;
    @Column(name="tipo")
    protected String tipo;
    @Column(name="linguagem")
    protected String linguagem;
    @Column(name="demandante")
    protected String demandante;
    @Column(name="empresaDesenvolvedora")
    protected String empresaDesenvolvedora;
    @Column(name="pontoFocal")
    protected String pontoFocal;
    @Column(name="gestorAutorizadorDev")
    protected String gestorAutorizadorDev;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    protected Usuario usuario;

    public SistemaAbstrato(){
    }

    public SistemaAbstrato(String sigla, String nome, int ano, String tipo, String linguagem, String demandante, String empresaDesenvolvedora, String pontoFocal, String gestorAutorizadorDev){
        this.sigla=sigla;
        this.nome=nome;
        this.ano=ano;
        this.tipo=tipo;
        this.linguagem=linguagem;
        this.demandante=demandante;
        this.empresaDesenvolvedora=empresaDesenvolvedora;
        this.pontoFocal=pontoFocal;
        this.gestorAutorizadorDev=gestorAutorizadorDev;
    }

    public SistemaAbstrato(String sigla, String nome, int ano, String tipo, String linguagem, String demandante, String empresaDesenvolvedora, String pontoFocal, String gestorAutorizadorDev, Usuario usuario){
        this(sigla, nome, ano, tipo, linguagem, demandante, empresaDesenvolvedora, pontoFocal, gestorAutorizadorDev);
        this.usuario=usuario;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getDemandante() {
        return demandante;
    }

    public void setDemandante(String demandante) {
        this.demandante = demandante;
    }

    public String getEmpresaDesenvolvedora() {
        return empresaDesenvolvedora;
    }

    public void setEmpresaDesenvolvedora(String empresaDesenvolvedora) {
        this.empresaDesenvolvedora = empresaDesenvolvedora;
    }

    public String getPontoFocal() {
        return pontoFocal;
    }

    public void setPontoFocal(String pontoFocal) {
        this.pontoFocal = pontoFocal;
    }

    public String getGestorAutorizadorDev() {
        return gestorAutorizadorDev;
    }

    public void setGestorAutorizadorDev(String gestorAutorizadorDev) {
        this.gestorAutorizadorDev = gestorAutorizadorDev;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        return "Sistema: [Sigla = " + this.sigla  + "solicitado por = " + this.demandante  + " ]";
    }
}

