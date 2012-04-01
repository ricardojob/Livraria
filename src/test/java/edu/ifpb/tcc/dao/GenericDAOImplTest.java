/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.tcc.dao;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo Job
 */
public class GenericDAOImplTest {
    
    public GenericDAOImplTest() {
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

    /**
     * Test of salvar method, of class GenericDAOImpl.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Object o = null;
        GenericDAOImpl instance = new GenericDAOImpl();
        boolean expResult = false;
        boolean result = instance.salvar(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class GenericDAOImpl.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        Object o = null;
        GenericDAOImpl instance = new GenericDAOImpl();
        boolean expResult = false;
        boolean result = instance.remover(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of listarCpf method, of class GenericDAOImpl.
     */
    @Test
    public void testListarCpf() {
        System.out.println("listarCpf");
        Class<?> t = null;
        String cpf = "";
        GenericDAOImpl instance = new GenericDAOImpl();
        Object expResult = null;
        Object result = instance.listarCpf(t, cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodos method, of class GenericDAOImpl.
     */
    @Test
    public void testListarTodos() {
        System.out.println("listarTodos");
        Class<?> t = null;
        GenericDAOImpl instance = new GenericDAOImpl();
        List expResult = null;
        List result = instance.listarTodos(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class GenericDAOImpl.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Class<?> t = null;
        String whereClause = "";
        GenericDAOImpl instance = new GenericDAOImpl();
        List expResult = null;
        List result = instance.listar(t, whereClause);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of mesclar method, of class GenericDAOImpl.
     */
    @Test
    public void testMesclar() {
        System.out.println("mesclar");
        Object o = null;
        GenericDAOImpl instance = new GenericDAOImpl();
        boolean expResult = false;
        boolean result = instance.mesclar(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class GenericDAOImpl.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        Object o = null;
        GenericDAOImpl instance = new GenericDAOImpl();
        boolean expResult = false;
        boolean result = instance.atualizar(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to//fail.
       //fail("The test case is a prototype.");
    }
}
