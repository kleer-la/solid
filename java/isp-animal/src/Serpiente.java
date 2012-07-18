
public class Serpiente extends Animal {

    private boolean alimentada = false;

    @Override
	public void alimentar() {
    	alimentada = true;
	}

	@Override
	public void acariciar() {
        // ignore - No voy a acariciar a una serpiente
	}

	@Override
	public String getEstado() {
        String estado = "quiero una rata";

        if (this.alimentada)
			estado = "no " + estado;

        return estado;
	}
}