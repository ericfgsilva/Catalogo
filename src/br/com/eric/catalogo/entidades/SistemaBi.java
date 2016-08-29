package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */

@Entity
@DiscriminatorValue(value="2")
public class SistemaBi extends Sistema implements Serializable {
}
