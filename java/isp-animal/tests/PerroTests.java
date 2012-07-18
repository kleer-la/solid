import junit.framework.TestCase;

public class PerroTests extends TestCase {

    public void testSinAlimentar() {
        // arrange
    	Animal p = new Perro();

        // assert
    	assertEquals("quiero un hueso y quiero jugar", p.getEstado());
    }

    public void testAlimentado() {
        // arrange
    	Animal p = new Perro();

        // act
        p.alimentar();

        // assert
    	assertEquals("no quiero un hueso y quiero jugar", p.getEstado());
    }

    public void testAlimentadoYAcariciado() {
        // arrange
        Animal p = new Perro();

        // act
        p.alimentar();
        p.acariciar();

        // assert
    	assertEquals("no quiero un hueso", p.getEstado());
    }
}