package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	static private int numTV;
	
	public TV(Marca LaMarca, boolean ElEstado) {
		this.marca = LaMarca;
		this.estado = ElEstado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public Boolean getEstado() {
		return estado;
	}
	
	public void volumenUp() {
		if (volumen < 7 && estado == true) {
			volumen++;
			}
	}
		
	public void volumenDown() {
		if (volumen > 0 && estado == true) {
			volumen--;
		}
	}
	
	public void canalUp() {
		if (canal < 120 && estado == true) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (canal > 0 && estado == true) {
			canal--;
		}
	}
	
	public void setCanal(int canal) {
		if (canal <= 120 && canal >= 1 && estado == true) {
			this.canal = canal;
		}
	}
}
