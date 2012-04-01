/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.tcc.testesEntidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Neto Mardocê
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({edu.ifpb.tcc.testesEntidades.EnderecoTeste.class,
    edu.ifpb.tcc.testesEntidades.CompraTeste.class, edu.ifpb.tcc.testesEntidades.ClienteTeste.class,
    edu.ifpb.tcc.testesEntidades.PagamentoTeste.class, edu.ifpb.tcc.testesEntidades.AutorTeste.class,
    edu.ifpb.tcc.testesEntidades.PessoaTeste.class, edu.ifpb.tcc.testesEntidades.LivroTeste.class,
    edu.ifpb.tcc.testesEntidades.EditoraTeste.class, edu.ifpb.tcc.testesEntidades.FuncionarioTeste.class,
    edu.ifpb.tcc.testesEntidades.CargoTeste.class})
public class SuiteTesteEntidades {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}