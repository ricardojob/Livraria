/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.tcc.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Neto Mardocê
 */
public class GenericDAOImpl implements GenericDAO<Object> {

    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    public boolean salvar(Object o) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("DAC_LivrariaPU");
        this.entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(o);
            transaction.commit();
            return true;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    public boolean remover(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object listarCpf(Class<?> t, String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <T> List<T> listarTodos(Class<?> t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <T> List<T> listar(Class<?> t, String whereClause) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean mesclar(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean atualizar(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
