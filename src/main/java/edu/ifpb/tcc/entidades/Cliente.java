/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Neto Mardocê
 */

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "rg")})
public class Cliente extends Pessoa{

    private int rg;

    public Cliente() {
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
}