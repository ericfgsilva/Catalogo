package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */
@Entity
@DiscriminatorValue(value="0")
public class Usuario extends UsuarioAbstrato implements Serializable {

    public Usuario(){
    }

    public Usuario(String nome, String email, int ramal, String unidadeLotacao){
        this.nome=nome;
        this.email=email;
        this.ramal=ramal;
        this.unidadeLotacao=unidadeLotacao;
    }

    public Usuario(String nome, String email, int ramal, String unidadeLotacao, Perfil perfil){
        this(nome, email, ramal, unidadeLotacao);
        this.perfil=perfil;
    }
}
