package edu.ifpb.tcc.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Neto Mardocê
 */
@Entity
public class Autor implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String paisDeOrigem;
    @ManyToMany
    private List<Livro> livros;

    public Autor() {
        this.livros = new ArrayList<Livro>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removeLivro(Livro livro) {
        this.removeLivro(livro);
    }

    @Override
    public String toString() {
        return "Autor{ " + "id=" + id + ", nome=" + nome + ", paisDeOrigem=" + paisDeOrigem + ", livros=" + livros + '}';
    }
}
