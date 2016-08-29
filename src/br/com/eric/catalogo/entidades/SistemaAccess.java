package br.com.eric.catalogo.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by efgs on 28/08/16.
 */

@Entity
@DiscriminatorValue(value="1")
public class SistemaAccess extends Sistema implements Serializable {
}
