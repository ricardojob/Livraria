/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Neto Mardocê
 */
@Entity
public class Editora implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String email;
    private String site;
    @OneToMany(mappedBy = "editora")
    private List<Livro> publicacoes;
    @Embedded
    private Endereco endereco;

    public Editora() {
        this.publicacoes = new ArrayList<Livro>();
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSite() {
        return site;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void addPublicacao(Livro livro){
        this.publicacoes.add(livro);
    }

    public void removePublicacao(Livro livro){
        this.publicacoes.remove(livro);
    }
}
