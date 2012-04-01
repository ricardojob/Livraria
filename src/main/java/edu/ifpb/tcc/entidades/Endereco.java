/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Neto Mardocê
 */

@Embeddable
public class Endereco implements Serializable {

    private String cidade;
    private String rua;
    private String bairro;
    private String numero;

    public Endereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
