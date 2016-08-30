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
    @Column(name="sistemaAno")
    protected int sistemaAno;
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

    public SistemaAbstrato(String sigla, String nome, int sistemaAno, String tipo, String linguagem, String demandante, String empresaDesenvolvedora, String pontoFocal, String gestorAutorizadorDev){
        this.sigla=sigla;
        this.nome=nome;
        this.sistemaAno=sistemaAno;
        this.tipo=tipo;
        this.linguagem=linguagem;
        this.demandante=demandante;
        this.empresaDesenvolvedora=empresaDesenvolvedora;
        this.pontoFocal=pontoFocal;
        this.gestorAutorizadorDev=gestorAutorizadorDev;
    }

    public SistemaAbstrato(String sigla, String nome, int sistemaAno, String tipo, String linguagem, String demandante, String empresaDesenvolvedora, String pontoFocal, String gestorAutorizadorDev, Usuario usuario){
        this(sigla, nome, sistemaAno, tipo, linguagem, demandante, empresaDesenvolvedora, pontoFocal, gestorAutorizadorDev);
        this.usuario=usuario;
    }



    @Override
    public String toString(){
        return "Sistema: [Sigla = " + this.sigla  + "solicitado por = " + this.demandante  + " ]";
    }
}

