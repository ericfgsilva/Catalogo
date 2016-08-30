package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */
@Entity
@DiscriminatorValue(value="0")
public class Sistema extends SistemaAbstrato implements Serializable{

    public Sistema(){
    }

    public Sistema(String sigla, String nome, int sistemaAno, String tipo, String linguagem, String demandante, String empresaDesenvolvedora, String pontoFocal, String gestorAutorizadorDev){
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

    public Sistema(String sigla, String nome, int sistemaAno, String tipo, String linguagem, String demandante, String empresaDesenvolvedora, String pontoFocal, String gestorAutorizadorDev, Usuario usuario){
        this(sigla, nome, sistemaAno, tipo, linguagem, demandante, empresaDesenvolvedora, pontoFocal, gestorAutorizadorDev);
        this.usuario=usuario;
    }
}
