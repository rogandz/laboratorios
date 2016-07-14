package source;

public interface Radio {
	public void ON_OFF();
	public void AM_FM();
	public void Cambio_de_Emisora(boolean a);
	public void Guardar_Emisora(int x);
	public void Seleccionar_Emisora_Guardada(int x);
	public void Guardar_Seleccion();
	public double getEmisora();
}
