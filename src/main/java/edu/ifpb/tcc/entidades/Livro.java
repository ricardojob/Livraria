/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Neto Mardocê
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "isbn")})
public class Livro implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    private String ISBN;
    private double valor;
    private String anoPublicacao;
    @ManyToOne
    private Editora editora;
    @ManyToMany(mappedBy = "livros")
    private List<Autor> autores;
    @Enumerated(EnumType.STRING)
    private Origem origem;

    public enum Origem {

        Nacional,
        Internacional
    }

    public Livro() {
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getISBN() {
        return ISBN;
    }

    public Editora getEditora() {
        return editora;
    }

    public int getId() {
        return id;
    }

    public Origem getOrigem() {
        return origem;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public void removeAutor(Autor autor){
        this.autores.remove(autor);
    }
}
