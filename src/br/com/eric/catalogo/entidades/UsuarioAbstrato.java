package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */
@Entity
@Table(name="td_usuario")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="perfil", discriminatorType=DiscriminatorType.INTEGER)
public abstract class UsuarioAbstrato implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    @Column(name="nome")
    protected String nome;
    @Column(name="email")
    protected String email;
    @Column(name="ramal")
    protected int ramal;
    @Column(name="unidadeLotacao")
    protected String unidadeLotacao;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    protected Perfil perfil;

    public UsuarioAbstrato(){
    }

    public UsuarioAbstrato(String nome, String email, int ramal, String unidadeLotacao){
        this.nome=nome;
        this.email=email;
        this.ramal=ramal;
        this.unidadeLotacao=unidadeLotacao;
    }

    public UsuarioAbstrato(String nome, String email, int ramal, String unidadeLotacao, Perfil perfil){
        this(nome, email, ramal, unidadeLotacao);
        this.perfil=perfil;
    }

    @Override
    public String toString(){
        return "Usuário: [Nome = " + this.nome  + "da lotação = " + this.unidadeLotacao  + " ]";
    }
}

