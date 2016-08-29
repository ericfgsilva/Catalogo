package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */

@Entity
@DiscriminatorValue(value="3")
public class SistemaWeb extends Sistema implements Serializable{
}
