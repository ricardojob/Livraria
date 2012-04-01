/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.tcc.testesEntidades;
 
import edu.ifpb.tcc.entidades.Autor;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

/**
 *
 * @author Neto Mardocê
 */
public class AutorTeste {

    public AutorTeste() {
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
    public void TesteCriarAutor(){
        Autor autor = new Autor();
        assertNotNull(autor);
    }
}