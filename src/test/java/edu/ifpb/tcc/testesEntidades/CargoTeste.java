
package edu.ifpb.tcc.testesEntidades;


 
import edu.ifpb.tcc.entidades.Cargo;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

/**
 *
 * @author Neto Mardocê
 */
public class CargoTeste {

    public CargoTeste() {
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
    public void testeCriarCargo(){
        Cargo cargo = new Cargo();
        assertNotNull(cargo);
    }

}