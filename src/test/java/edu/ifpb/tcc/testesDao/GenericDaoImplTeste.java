/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.tcc.testesDao;

import edu.ifpb.tcc.dao.GenericDAO;
import edu.ifpb.tcc.dao.GenericDAOImpl;
import edu.ifpb.tcc.entidades.Cargo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.*;

/**
 *
 * @author Neto Mardocê
 */
public class GenericDaoImplTeste {

    public GenericDaoImplTeste() {
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
    public void testeCriar() {
        //Usar mocks
        GenericDAO dao = new GenericDAOImpl();
        assertNotNull(dao);
    }

    @Test
    public void testarSalvar() {
        Cargo cargo = new Cargo();
        cargo.setFuncao("Vendedor");
        cargo.setSalario(1000);
        GenericDAOImpl daoImpl = new GenericDAOImpl();
        assertTrue("Nao conectou a Base dados!", daoImpl.salvar(cargo));
    }
}