/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.testesEntidades;

import edu.ifpb.tcc.entidades.Cliente;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

/**
 *
 * @author Neto Mardocê
 */
public class ClienteTeste {

    public ClienteTeste() {
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
    public void TesteCriarCliente(){
        Cliente cliente = new Cliente();
        assertNotNull(cliente);
    }
}