/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.dao;

import java.util.List;

/**
 *
 * @author Neto Mardocê
 */
public interface GenericDAO <T>{

    public boolean salvar(Object o);

    public boolean remover(Object o);

    public Object listarCpf(Class<?> t, String cpf);

    public <T> List<T> listarTodos(Class<?> t);

    public <T> List<T> listar(Class<?> t, String whereClause);

    public boolean mesclar(Object o);

    public boolean atualizar(Object o);

}
