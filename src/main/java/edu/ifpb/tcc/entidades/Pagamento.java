/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Neto Mardocê
 */
@Entity
public class Pagamento implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private double valor;
    @OneToOne
    private Compra compra;
}
