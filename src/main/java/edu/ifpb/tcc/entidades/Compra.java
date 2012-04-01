/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Neto Mardocê
 */
@Entity
public class Compra implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @OneToMany
    private List<Livro> livros;
    @OneToOne
    private Funcionario funcionario;
    @OneToOne
    private Cliente cliente;

    public Compra() {
        this.livros = new ArrayList<Livro>();
    }

    public void addLivro(Livro livro){
        this.livros.add(livro);
    }

    public void removeLivro(Livro livro){
        this.livros.add(livro);
    }
}
