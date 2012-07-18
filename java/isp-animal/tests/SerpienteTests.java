import junit.framework.TestCase;

public class SerpienteTests extends TestCase {
	
    public void testSinAlimentar() {
        // arrange
    	Animal p = new Serpiente();

        // assert
    	assertEquals("quiero una rata", p.getEstado());
    }

    public void testAlimentado() {
        // arrange
    	Animal p = new Serpiente();

        // act
        p.alimentar();

        // assert
    	assertEquals("no quiero una rata", p.getEstado());
    }

}
