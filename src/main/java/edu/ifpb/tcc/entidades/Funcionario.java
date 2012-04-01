/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Neto Mardocê
 */
@Entity
public class Funcionario extends Pessoa {

    private String senha;
    @OneToOne
    private Cargo cargo;

    public Funcionario() {
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
