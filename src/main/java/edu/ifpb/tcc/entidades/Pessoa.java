/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Neto Mardocê
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "cpf")})
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    @Embedded
    private Endereco endereco;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public enum Sexo {

        Feminino,
        Masculino
    }

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
