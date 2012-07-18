
public class Perro extends Animal {

    private boolean alimentado = false;
    private boolean acariciado = false;

    @Override
	public void alimentar() {
    	this.alimentado = true;
	}

	@Override
	public void acariciar() {
		this.acariciado = true;
	}

	@Override
	public String getEstado() {
        String estado = "";

        if (this.alimentado)
			estado = "no quiero un hueso";
        if (!this.alimentado)
			estado = "quiero un hueso";
        if (!this.acariciado)
			estado += " y quiero jugar";

        return estado;
	}
}
