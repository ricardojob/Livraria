/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.testesEntidades;

import edu.ifpb.tcc.entidades.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Neto Mardocê
 */
public class PessoaTeste {

    public PessoaTeste() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TesteCriarPessoa(){
        Pessoa pessoa = new Pessoa();
        assertNotNull(pessoa);
    }
}